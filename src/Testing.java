import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.LocalDateTime;
public class Testing {
    @Test
    public void testLikeSubmission() {
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        nf.likeSubmission(m1);
        Assert.assertEquals(m1.getLikes(), 1);
    }

    @Test
    public void testGetSubmissionsOfUser() {
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        PhotoMessage pm1 = new PhotoMessage("pippo123", "image.png", "an image");
        PhotoMessage pm2 = new PhotoMessage("nico123", "image.png", "an image");
        nf.addSubmission(m1);
        nf.addSubmission(pm1);
        nf.addSubmission(pm2);
        int subVal = nf.getSubmissionsOfUser("pippo123").size();
        Assert.assertEquals(subVal, 2);

        nf.removeSubmission(m1);
        nf.removeSubmission(pm1);
        subVal = nf.getSubmissionsOfUser("pippo123").size();
        Assert.assertEquals(subVal, 0);
    }

    @Test
    public void testGetCommentList() {
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        PhotoMessage pm1 = new PhotoMessage("pippo123", "image.png", "an image");
        nf.addSubmission(m1);
        nf.addSubmission(pm1);
        nf.commentSubmission(m1, "nice message!");
        nf.commentSubmission(pm1, "nice image!");
        int commVal = nf.getSubmissionsOfUser("pippo123").size();
        Assert.assertEquals(commVal, 2);

        nf.removeSubmission(m1);
        nf.removeSubmission(pm1);
        commVal = nf.getSubmissionsOfUser("pippo123").size();
        Assert.assertEquals(commVal, 0);
    }
    @Test
    public void testGetTimeString(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        m1.setTimestamp(LocalDateTime.of(2024, 1, 30, 10, 30));
        String timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 1 hour ago");

        m1.setTimestamp(LocalDateTime.of(2023, 1, 30, 10, 30));
        timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 1 year ago");
    }
}
