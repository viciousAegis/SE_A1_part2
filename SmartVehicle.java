import java.util.*;

public class SmartVehicle {
    public enum VehicleType {
        BIKE,
        BICYCLE,
        MOPED
    }
    private String vehicleID;
    private VehicleType vehicleType;
    private String location;
    private Trip currentTrip;
    private boolean inUse;
    private double rating;
    private DockingStation dockingStation;
    private String statusMessage;
    private TripHistory tripHistory;

    // Constructor
    public SmartVehicle(){
        this.vehicleID = "";
        this.vehicleType = null;
        this.location = "";
        this.inUse = false;
        this.rating = 0.0;
        this.statusMessage = "";
        this.tripHistory = null;
    }

    public SmartVehicle(String vehicleID, VehicleType vehicleType, String location) {
        this.vehicleID = vehicleID;
        this.vehicleType = vehicleType;
        this.location = location;
        this.inUse = false;
        this.rating = 0.0;
        this.statusMessage = "Idle";
        this.tripHistory = null;
    }

    public String getVehicleLocation(){
        return this.location;
    }

    public String getVehicleID(){
        return this.vehicleID;
    }

    // Getter and Setter methods (assume they're created for those not mentioned)
    public double getRating() {
        return this.rating;
    }

    Boolean setRating(double rating) {
        this.rating = rating;
        return true;
    }

    // Method to calculate the rating of the vehicle
    public double calculateRating(Feedback feedback) {
        // Implementation to calculate the rating based on historical trip data
        // Average all the ratings from the trips taken until now and store it in ratings
        double rating = getRating();
        double trip_rating = feedback.getRating();
        // update rating based on weighted average by including trip_rating
        return rating;
    }

    // Method to dock the vehicle at a docking station
    public boolean dockAtStation() {
        // Implementation to dock the vehicle at a docking station
        // Update the vehicle's location and set the docking station
        this.location = dockingStation.getLocation();
        this.dockingStation = dockingStation;
        return dockingStation.dockVehicle(this);
    }

    // Method to undock the vehicle from a docking station
    public boolean undockFromStation() {
        if (dockingStation != null) {
            // Implementation to undock the vehicle from a docking station
            // Update the vehicle's location and clear the docking station
            this.location = null;
            boolean success = dockingStation.undockVehicle(this);
            if (success) {
                this.dockingStation = null;
            }
            return success;
        } else {
            // Vehicle is not currently docked, so undocking is not applicable
            return false;
        }
    }

    // Method to update the status message of the vehicle
    public boolean updateStatus(String status) {
        // Implementation to update the status message of the vehicle
        this.statusMessage = status;
        return true;
    }
}
