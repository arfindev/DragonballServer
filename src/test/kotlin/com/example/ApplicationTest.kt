package com.example

import com.example.model.ApiResponse
import com.example.repository.HeroRepository
import com.example.repository.HeroRepositoryImpl
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.testing.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)

    @Test
    fun `access endpoint, checking if the status is ok or not`() = testApplication {

        val response = client.get("/")
        assertEquals(HttpStatusCode.OK, actual = response.status)
        assertEquals("Welcome to DragonBall API", actual = response.bodyAsText())

    }

    @Test
    fun `access all heroes endpoint, query all pages, assert correct information`() = testApplication {
        val pages = 1..5
        val heroRepository = HeroRepositoryImpl()
        val heroes = listOf(
            heroRepository.page1,
            heroRepository.page2,
            heroRepository.page3,
            heroRepository.page4,
            heroRepository.page5
        )
        pages.forEach { page ->
            val response = client.get("/dragonball/heroes?page=$page")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = calculatePage(page = page)["prevPage"],
                nextPage = calculatePage(page = page)["nextPage"],
                heroes = heroes[page - 1]
            )

            assertEquals(expected = expected, actual = actual)
        }
    }


    fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf("prevPage" to prevPage, "nextPage" to nextPage)
    }

}
