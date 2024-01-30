import java.time.LocalDateTime;
import java.util.ArrayList;

public class Submission {
    private String username;
    private LocalDateTime timestamp;
    private int likes;
    private ArrayList<String> commentList;

    public Submission(String username) {
        this.username = username;
        this.timestamp = LocalDateTime.now();
        this.likes = 0;
        this.commentList = new ArrayList<String>();
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
    public void addComment(String comment){
        commentList.add(comment);
    }
    public ArrayList<String> getCommentList() {
        return commentList;
    }

    public void setCommentList(ArrayList<String> commentList) {
        this.commentList = commentList;
    }
    public String toString(){
        return "username: " + username + " | timestamp: " + timestamp;
    }
}
