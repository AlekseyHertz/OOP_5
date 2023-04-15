open class Video (
    val videoId: Int, //идентификатор видеозаписи
    val videoDuration: Int, //длительность видеозаписи
    val videoTitle: Int, //название видеозаписи
    val videoDate: Int, //дата создания видеозаписи
    val videoViews: Int //количество просмотров видеозаписи
)
open class Audio (
    val audioId: Int, //идентификатор аудиозаписи
    val audioOwnerId: Int, //идентификатор владельца аудиозаписи
    val audioArtist: String, //исполнитель аудиозаписи
    val audioTitle: String, //название аудиозаписи
    val audioDuration: Int, //дилтельность аудиозаписи
)

open class Photo (
    val photoId: Int, //идентификатор фото
    val photoAlbumId: Int, //идентификатор альбома фото
    val photoOwnerId: Int, //идентификатор владельца фото
    val photoText: String, //текст описания фото
    val photoDate: Int, //дата фото
)