data class Post(
    var id: Int, // индентификатор записи
    val ownerId: Int, // идентификатор владельца стены
    val fromId: Int, // идентификатор владельца
    val date: Int, // дата
    val text: String?, // текст
    val commentCount: Comment?, // количество комментарий
    val likesCount: Likes, // число лайков
)

class videoAttachment( //  класс наследник от Видео
    videoId: Int, //идентификатор видеозаписи
    videoDuration: Int, //длительность видеозаписи
    videoTitle: Int, //название видеозаписи
    videoDate: Int, //дата создания видеозаписи
    videoViews: Int, //количество просмотров видеозаписи)
    val original: Video
) : Video(
    videoId,
    videoDuration,
    videoTitle,
    videoDate,
    videoViews,
) {
    override fun toString(): String {
        return "$videoTitle, post"
    }
}

class audioAttachment(
    audioId: Int, //идентификатор аудиозаписи
    audioOwnerId: Int, //идентификатор владельца аудиозаписи
    audioArtist: String, //исполнитель аудиозаписи
    audioTitle: String, //название аудиозаписи
    audioDuration: Int, //дилтельность аудиозаписи
    val original: Audio,
) : Audio(
    audioId,
    audioOwnerId,
    audioArtist,
    audioTitle,
    audioDuration,
) {
    override fun toString(): String {
        return "$audioDuration"
    }
}

class photoAttachment (
    photoId: Int, //идентификатор фото
    photoAlbumId: Int, //идентификатор альбома фото
    photoOwnerId: Int, //идентификатор владельца фото
    photoText: String, //текст описания фото
    photoDate: Int, //дата фото
    val original: Photo,
) : Photo(
    photoId,
    photoAlbumId,
    photoOwnerId,
    photoText,
    photoDate,
) {
    override fun toString(): String {
        return "Text $photoText"
    }
}

fun main() {
    val post =
        Post(0, 0, 0, 0, " ", commentCount = Comment(0, true, true), likesCount = Likes(0, true))
    WallService.addPosts(
        Post(
            7,
            3,
            7,
            19_03_2023,
            " This wall is awsome",
            commentCount = Comment(0, true, true), likesCount = Likes(0, true)
        )
    )
    WallService.printTextPost(newPost = post)
    WallService.printPost(post)

    val audioTrack = Audio (1,1, "Tiesto", "Infinity",3)
    val audio = audioAttachment (2,2,"FatboySlim", "PushTempo", 3, audioTrack)
}