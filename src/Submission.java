import java.time.LocalDateTime;
import java.util.ArrayList;

public class Submission {
    private String username;
    private LocalDateTime timestamp;
    private int likes;
    private ArrayList<String> commentList;

    public Submission(String username, LocalDateTime timestamp, int likes, ArrayList<String> commentList) {
        this.username = username;
        this.timestamp = timestamp;
        this.likes = likes;
        this.commentList = commentList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getCommentList() {
        return commentList;
    }

    public void setCommentList(ArrayList<String> commentList) {
        this.commentList = commentList;
    }
}
