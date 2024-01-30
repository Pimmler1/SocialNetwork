import org.testng.Assert;
import org.testng.annotations.Test;
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
        nf.addSubmission(m1);
        nf.addSubmission(pm1);
        int subVal = nf.getSubmissionsOfUser("pippo123").size();
        Assert.assertEquals(subVal, 2);
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
    }
}
