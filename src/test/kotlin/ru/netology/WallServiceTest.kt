package ru.netology

import Post
import WallService.posts
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add(post: Post) {
        assertEquals(post.id == 0L, 1111)
    }

    @Test
    fun update() {
        assertEquals(false, true)
    }
}