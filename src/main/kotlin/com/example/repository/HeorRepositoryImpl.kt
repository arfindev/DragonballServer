package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Hero

const val PREVIOUS_PAGE_KEY = "prevPage"
const val NEXT_PAGE_KEY = "nextPage"

class HeroRepositoryImpl : HeroRepository {
    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1, 2 to page2, 3 to page3, 4 to page4, 5 to page5
        )
    }
    override val page1 = listOf(
        Hero(
            id = 1,
            name = "Kkarot",
            image = "/images/goku.png",
            about = "Goku, born Kakarot, is a male Saiyan and the main protagonist of the Dragon Ball series. Goku is a Saiyan originally sent to Earth as an infant with the mission to destroy its people. However, an accident alters his memory, allowing him to grow up to become Earth's greatest defender and the informal leader of the Dragon Team. He constantly strives and trains to be the greatest warrior possible, which has kept the Earth and the universe safe from destruction many times.",
            rating = 5.0,
            power = 100,
            month = "April",
            day = "18th",
            family = listOf(
                "Chi-Chi",
                "Gohan",
                "Goten",
            ),
            abilities = listOf(
                "Super Saiyan Transformations", "Super Kamehameha", "Super Dragon Fist"
            ),
            natureType = listOf(
                "Funny", "Aggressive"
            )
        ),

        Hero(
            id = 2,
            name = "Goku Black",
            image = "/images/gokublack.png",
            about = "Goku Black, usually referred to as Black, is the main antagonist of the Future Trunks Saga of Dragon Ball Super. His true identity is the original present Zamasu, a former North Kai and Supreme Kai apprentice serving the Supreme Kai of Universe 10, Gowasu, from the unaltered main timeline, in which he stole the body of the original present Goku and sought to destroy all mortals alongside Future Zamasu. He was given the name Goku Black by Future Bulma when he initially referred to himself as Son Goku. His original appearance is the same as his future timeline counterpart, being an above-average height Kai of slim built and green skin, and with a white Mohawk. However, after killing the original present Gowasu, he wore his former master's matching set of gold and green Potara earrings. After stealing the original present Goku's body, it underwent physical changes. While still essentially identical, he has a slightly darker skin tone and more defined eyes, along with a somewhat skinnier physique. His hair is also a noticeably dark shade of black with only four front spikes and three back ones. While initially wearing his Supreme Kai attire, he soon after taking Goku's body began wearing a sleeveless dark grey tunic, a long-sleeved black undershirt with a turtleneck, a red sash, black pants and white boots. He also gave the right Potara earring to his future counterpart while still wearing the other earring on his left ear. In the anime, he also wears a Time Ring on his right index finger, while in the manga, his counterpart is trusted with wearing it. Also, in the manga, he has dark outlines around his eyes.",
            rating = 4.0,
            power = 88,
            month = "April",
            day = "18th",
            family = listOf(


            ),
            abilities = listOf(
                "Super Saiyan Transformations",
                "Black Kamehameha",
                "Saiyan Slicer"
            ),
            natureType = listOf(
                "Silly", "Aggressive"
            )
        ),

        Hero(
            id = 3,
            name = "Vegeta",
            image = "/images/vegeta.png",
            about = "Vegeta is the Prince of an extraterrestrial race of warriors known as the Saiyans just like the series' protagonist, Goku. Vegeta is extremely vain and proud, constantly referring to his heritage throughout the series. He believes he should be regarded as the strongest fighter in the Universe and becomes obsessed with surpassing Goku after fighting him. After his loss to Goku and the Z fighters, Vegeta later reluctantly unites with the heroes to thwart greater threats to the universe. Throughout the series, Vegeta's role changes from villain to antihero and later as one of the heroes, while remaining a rival to Goku. Vegeta's character, particularly his personality, has been well received. He is one of the Dragon Ball franchise's most popular characters.",
            rating = 4.0,
            power = 88,
            month = "January",
            day = "19th",
            family = listOf(
                "Trunks",
                "Bulma",
                "Bulla"

            ),
            abilities = listOf(
                "Super Saiyan Transformations",
                "Final Flash",
                "Big Bang Attack"
            ),
            natureType = listOf(
                "Ruthless", "Aggressive",
                "Cold Blooded"
            )
        )

    )


    override val page2 = listOf(
        Hero(
            id = 4,
            name = "Gohan",
            image = "/images/gohan.png",
            about = "Gohan is a fictional character in the Dragon Ball manga series, created by Akira Toriyama. Gohan is introduced as the first son of the protagonist Goku, and his wife Chi-Chi, in chapter #196 Kakarrot, first published in Weekly Shōnen Jump magazine on October 8, 1988. Chi-Chi is a strict and protective mother to Gohan, forcing him to focus on his studies and forbidding him from practicing martial arts. However, due to the various threats to the Earth, she reluctantly allows him to fight, with him ultimately becoming one of the strongest characters in the series. Gohan has been well received by both fans and critics, the latter usually citing the character's growth from his initial appearance to his defeat of Cell.",
            rating = 5.0,
            power = 80,
            month = "April",
            day = "18th",
            family = listOf(
                "Chi-Chi",
                "Gohan",
                "Goten",
            ),
            abilities = listOf(
                "Super Saiyan Transformations",
                "Super Kamehameha",
                "Masenko"
            ),
            natureType = listOf(
                "Funny", "Dedicated"
            )
        ),
        Hero(
            id = 5,
            name = "Trunks",
            image = "/images/trunks.png",
            about = "Trunks has his grandfather's lavender hair color (blue in the manga) and his mother's blue eyes. He has his father's eye shape, facial features and tanned skin and his hair turns blond and eyes turn (pupil-less) green when he becomes a Super Saiyan. Several characters, such as Goku, Krillin and Bulma, remark how much Trunks resembles Vegeta. For the majority of the Buu Saga, Present Trunks wears a dark green gi, an orange belt, orange wristbands and the same golden boots that Future Trunks wears, he also wears this in the movie, Bio-Broly. In the events of Broly - Second Coming, Trunks wears a light green long sleeve hoodie with a black short sleeve undershirt with a red collar, indigo blue denim shorts and his golden boots from his primary outfit. He later wears Maloja's necklace. In Dragon Ball Z: Battle of Gods, Trunks wears overalls and a blue undershirt with maroon wristbands. At the end of Dragon Ball Z, Trunks now wears a black long-sleeved shirt, a golden vest, dark gray pants and the same golden boots that he wore as a child. Later he wears a black sleeveless muscle shirt with a CAPSULE logo at the center of his shirt, gray pants and his boots from his childhood.",
            rating = 5.0,
            power = 80,
            month = "April",
            day = "18th",
            family = listOf(
                "Chi-Chi",
                "Gohan",
                "Goten",
            ),
            abilities = listOf(
                "Super Saiyan Transformations",
                "Galic Gun",
                "Finish Buster"
            ),
            natureType = listOf(
                "Funny"
            )
        ),
        Hero(
            id = 6,
            name = "Frieza",
            image = "/images/frieza.png",
            about = "Frieza, romanized as Freeza in Japanese merchandise, Funimation's English subtitles and Viz Media's release of the manga, is a fictional character in the Dragon Ball manga series created by Akira Toriyama. Frieza makes his debut in Chapter #247: Dark Clouds Swirl Over Planet Namek, first published in Weekly Shōnen Jump magazine on October 6, 1989, as a galactic tyrant feared as the most powerful being in the universe. Despite not appearing until the manga's second half, Frieza is considered to be the most iconic antagonist from the Dragon Ball franchise due to effectively serving as the catalyst of many of the events depicted in the story, such as Goku's arrival on Earth, the Saiyans landing on Earth, and subsequently the main characters going to planet Namek. In his appearances in the manga itself, he is also directly responsible for the murder of Goku's father Bardock, the genocide of the Saiyan race, the death of Vegeta, and the second death of Goku's best friend Krillin, arguably making him Goku's most personal and significant enemy, and the final confrontation between Goku and Frieza has been hailed as one of the most memorable manga and anime battles ever.",
            rating = 5.0,
            power = 95,
            month = "April",
            day = "18th",
            family = listOf(
                "King Cold"
            ),
            abilities = listOf(
                "Eye Laser",
                "Death Beam",
                "Death Ball"
            ),
            natureType = listOf(
                "Joker", "Cold Blooded"
            )
        ),
    )

    override val page3 = listOf(
        Hero(
            id = 7,
            name = "Cell",
            image = "/images/cell.png",
            about = "Cell is the ultimate creation of Dr. Gero, who came from a future timeline, designed to possess all the abilities of the greatest fighters to have ever inhabited or visited Earth; the result was a perfect warrior, possessing numerous favorable genetic traits and special abilities. He was one of the few Red Ribbon Androids not directly completed by Dr. Gero; he was completed by Dr. Gero's Supercomputer. He is the main antagonist of the Imperfect Cell, Perfect Cell, and Cell Games Sagas.",
            rating = 5.0,
            power = 80,
            month = "April",
            day = "18th",
            family = listOf(

            ),
            abilities = listOf(
                "Energy Shield",
                "Super Kamehameha",
                "Destructo Disk"
            ),
            natureType = listOf(
                "Funny",
                "Aggressive"
            )
        ),
        Hero(
            id = 8,
            name = "Buu",
            image = "/images/buu.png",
            about = "Majin Buu, generally spelled Majin Boo in subtitles of the Japanese anime, and rendered as Djinn-Boo in the Viz Media manga, is a fictional character and the final antagonist in the Dragon Ball manga series created by Akira Toriyama. He is introduced in chapter #460 Majin Boo Appears?! Majin Bū Shutsugen ka!?) first published in Weekly Shōnen Jump magazine on March 1, 1994. Majin Buu is a genie-like magical life form created by the evil warlock Bibidi that terrorized galaxies by destroying entire planets, millions of years before the events of Dragon Ball take place. He was temporarily sealed away and brought to Earth; however, Bibbidi was killed and Buu remained hidden. During the events of Dragon Ball, he is revived by Bibidi's son Babidi in order to carry on his father's plan to conquer the entire universe.",
            rating = 5.0,
            power = 80,
            month = "April",
            day = "18th",
            family = listOf(
                "Babidi"
            ),
            abilities = listOf(
                "Absorption",
                "Healing",
                "Chocolate Beam"
            ),
            natureType = listOf(
                "Funny", "Aggressive"
            )
        ),
        Hero(
            id = 9,
            name = "Piccolo",
            image = "/images/piccolo.png",
            about = "Piccolo Jr., usually just called Piccolo also known as Ma Junior, is a Namekian and also the final child and reincarnation of the Demon King Piccolo, later becoming the reunification of the Nameless Namekian after fusing with Kami. According to Grand Elder Guru, Piccolo, along with Kami and King Piccolo, are part of the Dragon Clan, who were the original creators of the Dragon Balls. A wise and cunning warrior who was originally a ruthless enemy of Goku, Piccolo later becomes a permanent member of the Dragon Team, largely due to forming a mutual respect to Goku and even more from forming a close bond with Goku's first-born son Gohan.",
            rating = 5.0,
            power = 80,
            month = "April",
            day = "18th",
            family = listOf(

            ),
            abilities = listOf(
                "Special Beam Cannon",
                "Tri-Form",
                "Light Grenade"
            ),
            natureType = listOf(
                "Profound", "Intelligent"
            )
        ),
    )

    override val page4 = listOf(
        Hero(
            id = 1,
            name = "Kkarot",
            image = "/images/Kkarot.jpg",
            about = "Goku, born Kakarot, is a male Saiyan and the main protagonist of the Dragon Ball series. Goku is a Saiyan originally sent to Earth as an infant with the mission to destroy its people. However, an accident alters his memory, allowing him to grow up to become Earth's greatest defender and the informal leader of the Dragon Team. He constantly strives and trains to be the greatest warrior possible, which has kept the Earth and the universe safe from destruction many times.",
            rating = 5.0,
            power = 100,
            month = "April",
            day = "18th",
            family = listOf(
                "Chi-Chi",
                "Gohan",
                "Goten",
            ),
            abilities = listOf(
                "Super Saiyan Transformations",
                "Super Kamehameha",
                "Super Dragon Fist"
            ),
            natureType = listOf(
                "Funny",
                "Aggressive"
            )
        )
    )

    override val page5 = listOf(
        Hero(
            id = 1,
            name = "Kkarot",
            image = "/images/Kkarot.jpg",
            about = "Goku, born Kakarot, is a male Saiyan and the main protagonist of the Dragon Ball series. Goku is a Saiyan originally sent to Earth as an infant with the mission to destroy its people. However, an accident alters his memory, allowing him to grow up to become Earth's greatest defender and the informal leader of the Dragon Team. He constantly strives and trains to be the greatest warrior possible, which has kept the Earth and the universe safe from destruction many times.",
            rating = 5.0,
            power = 100,
            month = "April",
            day = "18th",
            family = listOf(
                "Chi-Chi",
                "Gohan",
                "Goten",
            ),
            abilities = listOf(
                "Super Saiyan Transformations",
                "Super Kamehameha",
                "Super Dragon Fist"
            ),
            natureType = listOf(
                "Funny",
                "Aggressive"
            )
        )
    )


    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            prevPage = calculatePage(page)[PREVIOUS_PAGE_KEY],
            heroes = heroes[page]!!
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
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

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(name)
        )
    }


    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }

}