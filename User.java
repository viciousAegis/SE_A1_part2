import java.util.List;
import java.util.ArrayList;
abstract class User {
    private String userID; // user ID
    private String name; // user name
    private String email; // user email
    private String password; // user password
    private Identification identification; // user identification
    private List<Feedback> appFeedback; // user feedback
    private double moneyDue; // money due
    private Wallet wallet; // user wallet

    public User() {
        this.userID = "";
        this.name = "";
        this.email = "";
        this.password = "";
        this.identification = new Identification();
        this.appFeedback = new ArrayList<Feedback>();
        this.moneyDue = 0;
        this.wallet = new Wallet();
    }

    // constructor
    public User(String userID, String name, String email, String password, Identification identification) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.identification = identification;
        this.appFeedback = new ArrayList<Feedback>();
        this.moneyDue = 0;
        this.wallet = new Wallet();
    }

    // methods
    public Boolean useVehicle() {
        // use vehicle
        return true;
    }

    public SmartVehicle scanQRCode() {
        // scan QR code
        return new SmartVehicle();
    }

    private Trip startTrip(SmartVehicle vehicle) {
        // start trip
        return new Trip();
    }

    public Boolean endTrip(SmartVehicle vehicle) {
        // end trip
        return true;
    }

    public Boolean renewVehicle(SmartVehicle vehicle) {
        // renew vehicle
        return true;
    }
    public Boolean provideFeedback(double rating, String comment) {
        // provide feedback
        return true;
    }
}