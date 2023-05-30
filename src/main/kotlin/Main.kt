import attachments.*
import posts.Comments
import posts.Likes
import posts.Post
import posts.PostType
import java.util.*

fun main() {
    WallService.add(Post(ownerId = 1, text = "14120"))
    //Thread.sleep(1000)
    WallService.add(Post(ownerId = 1, text = "132249"))
    WallService.add(Post(ownerId = 2, text = "141303"))
    WallService.add(Post(ownerId = 2, text = "402010", postType = PostType.REPLY))

    WallService.add(Post(ownerId = 3, text = "222222", likes = Likes(canLike = true)))

    WallService.update(Post(id = 2, text = "replaced", comments = Comments(canClose = true)))
    WallService.update(Post(id = 1, text = "new text", comments = Comments(canOpen = true), canPin = false))

    val audio = Audio(
        id = 1,
        ownerId = 1,
        artist = "Artist",
        title = "Title",
        duration = 120,
        url = "https://audio.com/audio.mp3"
    )
    val audioAttachment = AudioAttachment(audio)

    val event = Event(
        id = 1,
        time = 1622380800u,
        memberStatus = 1,
        isFavorite = true,
        address = "123 Main St",
        text = "Event description",
        buttonText = "GFSS"
    )
    val eventAttachment = EventAttachment(event)

    val graffiti = Graffiti(
        id = 1,
        ownerId = 1,
        photo130 = "https://poster.com/graffiti130.jpg",
        photo604 = "https://poster.com/graffiti604.jpg"
    )
    val graffitiAttachment = GraffitiAttachment(graffiti)

    val note = Note(
        id = 1,
        ownerId = 1,
        title = "Note title",
        text = "Note text",
        date = 1622380800u,
        comments = 0,
        readComments = 0,
        viewUrl = "https://note.com/note"
    )
    val noteAttachment = NoteAttachment(note)

    val postedPhoto = PostedPhoto(
        id = 1,
        ownerId = 1,
        photo130 = "https://photo.com/photo130.jpg",
        photo604 = "https://photo.com/photo604.jpg"
    )
    val postedPhotoAttachment = PostedPhotoAttachment(postedPhoto)


    WallService.add(Post(attachments = arrayOf(audioAttachment, eventAttachment, graffitiAttachment, noteAttachment, postedPhotoAttachment)))

    println(WallService)
}