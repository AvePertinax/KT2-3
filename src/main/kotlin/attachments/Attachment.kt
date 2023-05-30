package attachments

sealed class Attachment(val type: AttachmentType)

data class AudioAttachment(
    val audio: Audio
) : Attachment(AttachmentType.AUDIO)

data class EventAttachment(
    val event: Event
) : Attachment(AttachmentType.EVENT)

data class GraffitiAttachment(
    val event: Graffiti
) : Attachment(AttachmentType.GRAFFITI)

data class NoteAttachment(
    val note: Note
) : Attachment(AttachmentType.NOTE)

data class PostedPhotoAttachment(
    val postedPhoto: PostedPhoto
) : Attachment(AttachmentType.POSTED_PHOTO)