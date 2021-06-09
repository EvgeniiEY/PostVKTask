data class Post(
    val id: Long,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val commentsCount: Int,
    val commentsCanPost: Boolean,
    val commentsGroupsCanPost: Boolean,
    val commentsCanClose: Boolean,
    val commentsCanOpen: Boolean,
    val copyrightId: Int,
    val copyrightLink: String,
    val copyrightName: String,
    val copyrightType: String,
    val likesCount: Int,
    val likesUserLikes: Boolean,
    val likesCanLike: Boolean,
    val likesCanPublish: Boolean,
    val reportsCount: Int,
    val reportsUserReposted: Boolean,
    val viewsCount: Int,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int,
    val isFavorite: Boolean,
    val donutIsDonut: Boolean,
    val donutPaidDuration: Int,
    val donutPlaceHolder: Boolean,
    val donutCanPublishFreeCopy: Boolean,
    val donutEditMode: String,
    val postponedId: Int
)

object WallService {
    private var posts = emptyArray<Post>()
    private var id = 0L

    fun add(post: Post): Post {
        posts += post.copy(id = id++)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val isContains = posts.contains(id)
        return true


    }
}

