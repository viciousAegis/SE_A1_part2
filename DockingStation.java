import java.util.*;

public class DockingStation {
    private String dockingStationID;
    private String location;
    private String maintenanceStatus;
    private boolean isOccupied;

    // Constructor
    public DockingStation(String dockingStationID, String location) {
        this.dockingStationID = dockingStationID;
        this.location = location;
        this.isOccupied = false;
        this.maintenanceStatus = "";
    }

    // Getter and Setter methods (assume they're created)
    public String getDockingStationID() {
        return this.dockingStationID;
    }

    public String getMaintenanceStatus() {
        return this.maintenanceStatus;
    }

    public String getLocation() {
        return this.location;
    }

    // Method to update the status message of the docking station
    public boolean updateMaintenanceStatus(String status) {
        // Implementation to update the status message of the docking station
        this.maintenanceStatus = status;
        return true;
    }

    // Method to dock a vehicle at the docking station
    public boolean dockVehicle(SmartVehicle vehicle) {
        if (!isOccupied) {
            // Implementation to dock the vehicle at the docking station
            // Update the docking station's status and the vehicle's ID
            this.isOccupied = true;
            return true;
        } else {
            // Docking station is already occupied
            return false;
        }
    }

    // Method to undock a vehicle from the docking station
    public boolean undockVehicle(SmartVehicle vehicle) {
        if (isOccupied) {
            // Implementation to undock the vehicle from the docking station
            // Update the docking station's status and the vehicle's ID
            this.isOccupied = false;
            return true;
        } else {
            // Either the docking station is not occupied or the provided vehicle is not the one docked
            return false;
        }
    }

    // Method to get the location of a docked vehicle
    public String getVehicleLocation(SmartVehicle vehicle) {
        if (vehicle != null) {
            // Implementation to get the location of the docked vehicle
            return vehicle.getVehicleLocation();
        } else {
            // Either the docking station is not occupied or the provided vehicle is not the one docked
            return null;
        }
    }
}
