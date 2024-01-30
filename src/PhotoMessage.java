public class PhotoMessage extends Submission{
    private String fileName;
    private String imageCaption;
    public PhotoMessage(String username, String fileName, String imageCaption) {
        super(username);
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
    public String toString(){
        return "photo message: {" + super.toString() + "}";
    }
}
