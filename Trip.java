import java.util.Date;
import java.util.List;

public class Trip {
    private int tripId; // trip id
    private User user; // the user who took the trip
    private SmartVehicle vehicle; // the vehicle used for the trip
    private Date startTime; // start time of the trip
    private Date endTime; // end time of the trip
    private PaymentScheme paymentScheme; // payment scheme of the trip
    private double cost; // cost of the trip
    private String startLocation; // start location of the trip
    private String endLocation; // end location of the trip
    private double distance; // distance of the trip
    private Boolean done; // whether the trip is done or not
    private Boolean isPaid; // whether the trip is paid or not
    private PaymentManager paymentManager; // payment manager
    private Feedback feedback; // feedback of the trip

    // default constructor
    public Trip() {
        this.tripId = 0;
        this.user = null;
        this.vehicle = null;
        this.startTime = null;
        this.endTime = null;
        this.paymentScheme = null;
        this.cost = 0;
        this.startLocation = null;
        this.endLocation = null;
        this.distance = 0;
        this.done = false;
        this.isPaid = false;
        this.paymentManager = null;
        this.feedback = null;
    }

    // constructor
    public Trip(int tripId, User user, SmartVehicle vehicle, Date startTime, Date endTime, PaymentScheme paymentScheme,
            double cost, String startLocation, String endLocation, double distance, Boolean done, Boolean isPaid,
            PaymentManager paymentManager, Feedback feedback) {
        this.tripId = tripId;
        this.user = user;
        this.vehicle = vehicle;
        this.startTime = startTime;
        this.endTime = endTime;
        this.paymentScheme = paymentScheme;
        this.cost = cost;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.done = done;
        this.isPaid = isPaid;
        this.paymentManager = paymentManager;
        this.feedback = feedback;
    }

    // functions

    public Feedback getFeedback() {
        return feedback;
    }

    public Boolean setFeedback(Feedback feedback) {
        this.feedback = feedback;
        return true;
    }

    public PaymentManager getPaymentManager() {
        return paymentManager;
    }

    public Boolean endTrip() {
        this.endTime = new Date();
        this.done = true;
        return true;
    }

    public Boolean setCost() {
        // use payment scheme to calculate cost
        List<Integer> paymentScheme = this.paymentScheme.getPaymentScheme();
        int x = paymentScheme.get(0);
        int y = paymentScheme.get(1);
        int z = paymentScheme.get(2);

        if (this.distance <= x) {
            this.cost = y;
        } else {
            this.cost = y + (this.distance - x) * z;
        }

        if (this.cost > 0) {
            return true;
        }

        return false;
    }
}
