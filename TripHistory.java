import java.util.*;

public class TripHistory {
    private List<Trip> trips;

    // Constructor
    public TripHistory() {
        this.trips = new ArrayList<>();
    }

    // Method to add a trip to the history
    public boolean addTrip(Trip trip) {
        // Implementation to add a trip to the history
        // (You can replace this with your own logic)
        return trips.add(trip);
    }

    // Method to view the trip history
    public List<Trip> viewHistory() {
        // Implementation to return a copy of the trip history
        // (You can replace this with your own logic)
        return this.trips;
    }
}
