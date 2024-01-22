public class SurveillanceCamera {
    private int cameraId; // camera id
    private String location; // location of the camera
    private String status; // status of the camera

    // constructor
    public SurveillanceCamera(int cameraId, String location, String status) {
        this.cameraId = cameraId;
        this.location = location;
        this.status = status;
    }

    // functions
    public Boolean turnOn() {
        this.status = "ON";
        if (this.status == "ON") {
            return true;
        }
        return false;
    }

    public Boolean turnOff() {
        this.status = "OFF";
        if (this.status == "OFF") {
            return true;
        }
        return false;
    }

    public String getStatus() {
        return status;
    }
}
