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
    public void testGetTimeString1(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        m1.setTimestamp(LocalDateTime.now().minusSeconds(1));
        String timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 1 second ago");
    }
    @Test
    public void testGetTimeString2(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        m1.setTimestamp(LocalDateTime.now().minusSeconds(20));
        String timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 20 seconds ago");
    }
    @Test
    public void testGetTimeString3(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        m1.setTimestamp(LocalDateTime.now().minusMinutes(2));
        String timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 2 minutes ago");
    }
    @Test
    public void testGetTimeString4(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        m1.setTimestamp(LocalDateTime.now().minusHours(5));
        String timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 5 hours ago");
    }
    @Test
    public void testGetTimeString5(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        m1.setTimestamp(LocalDateTime.now().minusDays(25));
        String timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 25 days ago");
    }
    @Test
    public void testGetTimeString6(){
        NewsFeed nf = new NewsFeed();
        Message m1 = new Message("pippo123", "Hi, i'm Pippo!");
        nf.addSubmission(m1);
        m1.setTimestamp(LocalDateTime.now().minusYears(1));
        String timeString = m1.getTimeString();
        Assert.assertEquals(timeString, "posted 1 year ago");
    }
}
