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
//    val comment: Comment?,
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

class Comment(
    val ownerId: Int,
    val postId: Long,
    val fromGroup: Int,
    val message: String,
    val replyToComment: Int,
    val stickerId: Int,
    val guid: String
)

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
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment) {
        for ((index, original) in posts.withIndex()) {
            if (original.id == comment.postId) {
                comments += comment
                return

            }
        }
        throw PostNotFoundException("Пост с таким id не существует = ${comment.postId}")
    }

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

class PostNotFoundException(s: String) : Throwable() {

}







