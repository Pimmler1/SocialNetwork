import java.time.LocalDateTime;
import java.util.ArrayList;

public class PhotoMessage extends Submission{
    private String fileName;
    private String imageCaption;
    public PhotoMessage(String username, LocalDateTime timestamp, int likes, ArrayList<String> commentList, String fileName, String imageCaption) {
        super(username, timestamp, likes, commentList);
        this.fileName = fileName;
        this.imageCaption = imageCaption;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getImageCaption() {
        return imageCaption;
    }

    public void setImageCaption(String imageCaption) {
        this.imageCaption = imageCaption;
    }
}
