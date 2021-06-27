package ru.netology

import Post
import WallService.add
import WallService.posts
import WallService.update
import java.util.Arrays

fun main() {
    val post = Post(
        1111,
        1,
        111111,
        111111,
        "A",
        1,
        1,
        1,
        1,
        true,
        true,
        true,
        true,
        1,
        "A",
        "A",
        "A",
        1,
        "A",
        true,
        true,
        1,
        true,
        1,
        "A",
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
        "A",
        1
    )

    println("${post.id}")

    val post2 = post.copy(id = 2222, createdBy = 222222, date = 222222)

    println("${post2.id}")

    add(post1)
    add(post2)


    println(update(post))

    println(posts.contentToString())


}