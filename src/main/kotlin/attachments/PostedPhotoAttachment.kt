package attachments
data class PostedPhoto(
    val id: Int = 0,
    val ownerId: Int = 0,
    val photo130: String = "",
    val photo604: String = ""
) : Attachment(AttachmentType.POSTED_PHOTO)