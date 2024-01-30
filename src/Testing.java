import java.time.LocalDateTime;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Testing {
    @Test
    public void testLikeSubmission(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", LocalDateTime.now(), 0, null, "Hi, i'm Pippo!");
        nf.likeSubmission(m1);
        Assert.assertEquals(m1.getLikes(), 1);
    }
}
