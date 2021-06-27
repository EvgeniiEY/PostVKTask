package ru.netology

import Post
import WallService
import org.junit.Test
import org.junit.Assert.*


class WallServiceTest {

    @Test
    fun add(post: Post) {
        assertEquals(post.id == 0L, 1111)
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
        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
}