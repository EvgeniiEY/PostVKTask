

data class Post(
    val id: Long,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String?,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val copyright: Copyright?,
    val comments: Comments?,
    val likes: Likes?,
    val donut: Donut?,
    val reposts: Reposts,
    val viewsCount: Int,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int,
    val isFavorite: Boolean,


    val postponedId: Int
)

class Copyright {
    val Id = 0
    val Link = ""
    val Name = ""
    val Type = ""
}

class Comments {
    val count = 0
    val canPost = false
    val groupsCanPost = false
    val canClose = false
    val canOpen = false
}

class Likes {
    val count = 0
    val userLikes = false
    val canLike = false
    val canPublish = false
}

class Donut {
    val isDonut = false
    val paidDuration = 0
    val placeHolder = false
    val canPublishFreeCopy = false
    val editMode = ""

}

class Reposts {
    val count = 0
    val userReposted = false
}

object WallService {
    var posts = emptyArray<Post>()
    private var id = 0L

    fun add(post: Post): Post {
        posts += post.copy(id = id++)
        return posts.last()
    }


    fun update(post: Post): Boolean {
        for ((index, original) in posts.withIndex()) {
            if (original.id == post.id) {
                posts[index] = post.copy(date = original.date, createdBy = original.createdBy)
                return true
            }
        }
        return false
    }

}







