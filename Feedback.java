// class Feedback {
//     -rating: double
//     -comment: String
//     +setRating(double rating)
//     +getRating(): double
//     +setComment(String comment)
//     +getComment(): String
// }


public class Feedback {
    private double rating;
    private String comment;

    public Feedback() {
        this.rating = 0.0;
        this.comment = "";
    }

    public Feedback(double rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public double getRating() {
        return this.rating;
    }

    public Boolean setRating(double rating) {
        this.rating = rating;
        return true;
    }

    public String getComment() {
        return this.comment;
    }

    public Boolean setComment(String comment) {
        this.comment = comment;
        return true;
    }
}
