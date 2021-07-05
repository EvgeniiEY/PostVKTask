package ru.netology


import Comments
import Copyright
import Donut
import Likes
import Post
import Reposts
import WallService
import WallService.posts
import junit.framework.Assert.*
import org.junit.Test



class WallServiceTest {
    val objCopyright = Copyright()
    val objLikes = Likes()
    val objReposts = Reposts()
    val objComments = Comments()
    val objDonut = Donut()


    @Test
    fun add() {
        assertEquals(posts[0].id == 0L, true)
    }

//    @AfterEach
//    fun clear() {
//        WallService.clear()
//    }


    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(
            Post(
                0,
                1,
                5,
                101991,
                "text",
                4,
                5,
                1,
                objCopyright,
                objComments,
                objLikes,
                objDonut,
                objReposts,
                99,
                "postType",
                2,
                true,
                true,
                true,
                1,
                true,
                2
            )
        )

//        service.add(Post(/* заполняете поля */))
////        service.add(Post(/* заполняете поля */))
//        // создаём информацию об обновлении
        val update = Post(
            0,
            1,
            5,
            101991,
            "text",
            4,
            5,
            1,
            objCopyright,
            objComments,
            objLikes,
            objDonut,
            objReposts,
            99,
            "postType CHANGED !",
            2,
            true,
            true,
            true,
            1,
            true,
            2
        )
        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
//    @AfterEach
//    fun clear() {
//        WallService.clear()
//    }

}