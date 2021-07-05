package ru.netology

interface Attachment {
    val type: String
}

class Attachments {
    var attachments = emptyArray<Attachment>()

    fun add(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }
}

class Photo(
    val id: Int,
    val albumId: Int,
    val userId: Int,
    val text: String
)

class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment


class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val date: Int
)

class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment

class Audio(
    val id: Int,
    val ownerId: Int,
    val userId: Int,
    val albumId: Int
)

class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment

class Doc(
    val id: Int,
    val ownerId: Int,
    val title: Int,
    val size: String
)

class DocAttachment(
    override val type: String = "document",
    val doc: Doc
) : Attachment

class Gift(
    val id: Int,
    val size: Int,
    val width: Int,
    val height: Int
)

class GiftAttachment(
    override val type: String = "gift",
    val gift: Gift
) : Attachment
