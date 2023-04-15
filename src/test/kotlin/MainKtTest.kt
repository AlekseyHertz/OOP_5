import org.junit.Assert.*
import org.junit.Test
import org.junit.Before
import WallService

class WallServiceTest {

    @Before
    fun refresh() {
        WallService.clear()
        WallService.addPosts(Post(0, 0, 0, 0, "", Comment(0, true, true), Likes(5, true)))
        WallService.addComment(Post(0, 0, 0, 0, "", Comment(0, true, true), Likes(5, true)))
    }

    @Test
    fun addPosts() {

        val newPost = Post(0, 0, 0, 0, "", Comment(0, true, true), Likes(5, true))
        val result = newPost.id

        assertEquals(0,result)
    }

    @Test
    fun upDateIsTrue() {

        val newPost = Post(0, 0, 0, 0, "", Comment(0, true, true), Likes(5, true))
        val result = WallService.upDate(newPost)

        assertTrue(result)
    }

    @Test
    fun upDateIsFalse() { //покапытается провести может вопросы какие-то //

        val newPost = Post(1, 0, 0, 0, "", Comment(0, true, true), Likes(5, true))
        val result = WallService.upDate(newPost)

        assertFalse(result)
    }
}