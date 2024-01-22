// Parking Lot class

import java.util.List;

public class ParkingLot {
    private int parkingLotId; // parking lot id
    private List<DockingStation> dockingStations; // list of docking stations
    private List<SmartVehicle> vehicles; // list of vehicles
    private int currentOccupancy; // current occupancy of the parking lot
    private String location; // location of the parking lot
    private int capacity; // capacity of the parking lot
    private List<SurveillanceCamera> surveillanceCameras; // list of surveillance cameras
    private List<DataLog> dataLogs; // list of data logs

    // default constructor
    public ParkingLot() {
        this.parkingLotId = 0;
        this.dockingStations = null;
        this.vehicles = null;
        this.currentOccupancy = 0;
        this.location = null;
        this.capacity = 0;
        this.surveillanceCameras = null;
        this.dataLogs = null;
    }

    // constructor
    public ParkingLot(int parkingLotId, List<DockingStation> dockingStations, List<SmartVehicle> vehicles,
            int currentOccupancy, String location, int capacity, List<SurveillanceCamera> surveillanceCameras,
            List<DataLog> dataLogs) {
        this.parkingLotId = parkingLotId;
        this.dockingStations = dockingStations;
        this.vehicles = vehicles;
        this.currentOccupancy = currentOccupancy;
        this.location = location;
        this.capacity = capacity;
        this.surveillanceCameras = surveillanceCameras;
        this.dataLogs = dataLogs;
    }

    // functions
    public SmartVehicle getVehicle(String vehicleId) {
        for (SmartVehicle vehicle : vehicles) {
            if (vehicle.getVehicleID() == vehicleId) {
                return vehicle;
            }
        }
        return null;
    }

    public String getDockingStationMaintanenceStatus(String dockingStationId) {
        for (DockingStation dockingStation : dockingStations) {
            if (dockingStation.getDockingStationID() == dockingStationId) {
                return dockingStation.getMaintenanceStatus();
            }
        }
        return null;
    }

    public Boolean logData(String data) {
        DataLog dataLog = new DataLog(data);
        dataLogs.add(dataLog);
        return true;
    }

    public List<DataLog> getDataLogs() {
        return dataLogs;
    }
}