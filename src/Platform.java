import java.util.ArrayList;
import java.time.LocalDateTime;
public class Platform {
    private ArrayList<Submission> submissionList;

    public Platform(ArrayList<Submission> submissionList) {
        this.submissionList = submissionList;
    }
    public void addSubmission(Submission submission){
        submissionList.add(submission);
    }
    public void removeSubmission(Submission submission){
        submissionList.remove(submission);
    }
    public void removeSubmission(int submissionIdx){
        submissionList.remove(submissionIdx);
    }
}
