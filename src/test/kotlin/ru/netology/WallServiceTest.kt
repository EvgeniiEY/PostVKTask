package ru.netology


import Comment
import Copyright
import Donut
import Likes
import Post
import Reposts
import WallService
import WallService.posts
import junit.framework.Assert.*
import org.junit.Test
import PostNotFoundException as PostNotFoundException1


class WallServiceTest {
    val objCopyright = Copyright()
    val objLikes = Likes()
    val objReposts = Reposts()
    val objDonut = Donut()

    val post = Post(
        0,
        1,
        5,
        101991,
        "text",
        4,
        5,
        1,
        objCopyright,
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
    val comment = Comment(1, 1, 1, "Text", 1, 1, "")
    val commentWrongId = Comment(1, 99999, 1, "Text", 1, 1, "")

    @Test
    fun add() {
        assertEquals(posts[0].id == 0L, true)
    }


    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(post)
        service.add(
            post.copy(text = "Second post text...")
        )
        service.add(
            post.copy(text = "Third post text...")
        )


        val update = post.copy(id = 2, text = "Third text...", copyright = objCopyright)
        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateNotExistingTest() {
        val service = WallService
        service.add(post)
        service.add(
            post.copy(text = "Second post text...")
        )
        service.add(
            post.copy(text = "Third post text...")
        )

        val update = post.copy(id = 200, text = "Changed text...")
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)

    }

    @Test
    fun updateCommentTest() {

        val service = WallService
        service.add(post)
        service.add(
            post.copy(text = "Second post text...")
        )
        service.add(
            post.copy(text = "Third post text...")
        )

        val result = try {
            service.createComment(comment)
            true
        } catch (e: PostNotFoundException1) {
            false
        }
        assertEquals(true, result)
    }

    @Test(expected = PostNotFoundException1::class)
    fun shouldThrow() {
        val service = WallService
        service.add(post)
        service.add(
            post.copy(text = "Second post text...")
        )
        service.add(
            post.copy(text = "Third post text...")
        )
        service.createComment(commentWrongId)
    }
}






