package ru.netology


import Post
import WallService
import WallService.posts
import junit.framework.Assert.*
import org.junit.Test
import org.junit.jupiter.api.AfterEach


class WallServiceTest {

    @Test
    fun add() {
        assertEquals(posts[0].id == 0L, true)
    }

    @AfterEach
    fun clear() {
        WallService.clear()
    }


    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(
            Post(
                1,
                1,
                1,
                1,
                "",
                1,
                1,
                1,
                1,
                true,
                true,
                true,
                true,
                1,
                "",
                "",
                "",
                1,
                "",
                true,
                true,
                1,
                true,
                1,
                "",
                1,
                true,
                true,
                true,
                1,
                true,
                true,
                1,
                true,
                true,
                "",
                1
            )
        )

//        service.add(Post(/* заполняете поля */))
////        service.add(Post(/* заполняете поля */))
//        // создаём информацию об обновлении
        val update = Post(
            0,
            2,
            2,
            2,
            "",
            1,
            1,
            1,
            1,
            true,
            true,
            true,
            true,
            1,
            "",
            "",
            "",
            1,
            "",
            true,
            true,
            1,
            true,
            1,
            "",
            1,
            true,
            true,
            true,
            1,
            true,
            true,
            1,
            true,
            true,
            "",
            1
        )
        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }


}