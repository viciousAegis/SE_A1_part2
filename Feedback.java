// 


public class Feedback {
    private int feedbackId; // feedback ID
    private String feedbackTopic; // feedback topic
    private String feedbackInformation; // feedback information

    public Feedback() {
        this.feedbackId = 0;
        this.feedbackTopic = "";
        this.feedbackInformation = "";
    }

    // constructor
    public Feedback(int feedbackId, String feedbackTopic, String feedbackInformation) {
        this.feedbackId = feedbackId;
        this.feedbackTopic = feedbackTopic;
        this.feedbackInformation = feedbackInformation;
    }

    // methods
    public int getFeedbackId() {
        return this.feedbackId;
    }

    public String getFeedbackTopic() {
        return this.feedbackTopic;
    }

    public String getFeedbackInformation() {
        return this.feedbackInformation;
    }
    
}
