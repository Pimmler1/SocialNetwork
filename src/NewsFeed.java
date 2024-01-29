import java.util.ArrayList;

public class NewsFeed {
    private ArrayList<Submission> submissionList;

    public NewsFeed(ArrayList<Submission> submissionList) {
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
    public ArrayList<Submission> getSubmissionsOfUser(String username){
        ArrayList<Submission> result = new ArrayList<>();
        for(Submission submission:submissionList){
            if(submission.getUsername().equals(username)){
                result.add(submission);
            }
        }
        return result;
    }
    public void likeSubmission(Submission submission){
        submission.setLikes(submission.getLikes()+1);
    }
}
