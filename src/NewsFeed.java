import java.util.ArrayList;

public class NewsFeed {
    private ArrayList<Submission> submissionList;

    public NewsFeed() {
        this.submissionList = new ArrayList<Submission>();
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

    /**
     * increases the like value of a submission by one
     * @param submission submission, which is liked
     */
    public void likeSubmission(Submission submission){
        if(submissionList.contains(submission)){
            submission.setLikes(submission.getLikes()+1);
        } else {
            System.err.println(submission + " is not available in news feed");
        }
    }

    /**
     * adds a comment to a submission
     * @param submission submission, which is commented
     * @param comment comment of the submission
     */
    public void commentSubmission(Submission submission, String comment){
        if(submissionList.contains(submission)){
            submission.addComment(comment);
        } else {
            System.err.println(submission + " is not available in news feed");
        }
    }

    /**
     * prints all submissions on the console
     */
    public void printALlSubmissions(){
        for(Submission submission:submissionList){
            System.out.println(submission);
        }
    }

    /**
     * prints all submission of a user on the console
     * @param username username of the user
     */
    public void printSubmissionOfUser(String username){
        for(Submission submission:submissionList){
            if(submission.getUsername().equals(username)){
                System.out.println(submission);
            }
        }
    }
}
