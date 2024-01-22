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
    public SmartVehicle(String vehicleID, VehicleType vehicleType, String location) {
        this.vehicleID = vehicleID;
        this.vehicleType = vehicleType;
        this.location = location;
        this.inUse = false;
        this.rating = 0.0;
        this.statusMessage = "Idle";
        this.tripHistory = null;
    }

    // Getter and Setter methods (assume they're created for those not mentioned)
    setRating(double rating) {
        this.rating = rating;
    }

    // Method to calculate the rating of the vehicle
    public double calculateRating() {
        // Implementation to calculate the rating based on historical trip data
        // Average all the ratings from the trips taken until now and store it in ratings
        double rating;
        setRating(rating);
    }

    // Method to dock the vehicle at a docking station
    public boolean dockAtStation() {
        // Implementation to dock the vehicle at a docking station
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
