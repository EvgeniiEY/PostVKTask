package ru.netology

import Comments
import Copyright
import Donut
import Likes
import Post
import Reposts
import WallService.add
import WallService.posts
import WallService.update
import java.util.Arrays
import kotlin.text.Typography.copyright

fun main() {

    val objCopyright = Copyright()
    val objLikes = Likes()
    val objReposts = Reposts()
    val objComments = Comments()
    val objDonut = Donut()


    val post = Post(
        1111,
        1,
        111111,
        111111,
        "A",
        1,
        1,
        1,
        copyright = objCopyright,
        comments = objComments,
        likes = objLikes,
        donut = objDonut,
        reposts = objReposts,
        99,
        "postType",
        3,
        true,
        true,
        true,
        22,
        true,
        2

    )

    println("${post.id}")

    val post2 = post.copy(id = 2222, createdBy = 222222, date = 222222)

    println("${post2.id}")

    add(post)
    add(post2)


    println(update(post))

    println(posts.contentToString())


}