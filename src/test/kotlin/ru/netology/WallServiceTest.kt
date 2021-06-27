package ru.netology

import Post
import WallService.posts
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add(post: Post) {
        assertEquals(posts.last(), posts)
    }

    @Test
    fun update() {
        assertEquals(false, true)
    }
}