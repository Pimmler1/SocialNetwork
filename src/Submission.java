import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.Duration;

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

    /**
     * returns the time of the creation of a submission until now, as a String
     * @return time of creation of submission until now, as a String
     */
    public String getTimeString(){
        long seconds = Duration.between(timestamp, LocalDateTime.now()).getSeconds();
        if(seconds < 60){
            if(seconds > 1){
                return "posted " + seconds + " seconds ago";
            } else {
                return "posted " + seconds + " second ago";
            }
        } else if(seconds < 60*60){
            long minutes = seconds/60;
            if(minutes > 1){
                return "posted " + minutes + " minutes ago";
            } else {
                return "posted " + minutes + " minute ago";
            }
        } else if(seconds < 60*60*24){
            long hours = seconds/60/60;
            if(hours > 1){
                return "posted " + hours + " hours ago";
            } else {
                return "posted " + hours + " hour ago";
            }
        } else {
            long days = seconds/60/60/60;
            if(days > 1){
                return "posted " + days + " days ago";
            } else {
                return "posted " + days + " day ago";
            }

        }
    }
    public String toString(){
        return "username: " + username + " | timestamp: " + timestamp;
    }
}
