import java.util.Date;

public class DataLog {
    private String data; // data
    private Date timestamp; // timestamp

    // default constructor
    public DataLog() {
        this.data = null;
        this.timestamp = null;
    }

    // constructor
    public DataLog(String data) {
        this.data = data;
        this.timestamp = new Date();
    }

    // functions

    public String getData() {
        return data;
    }

    public Date getTimestamp() {
        return timestamp;
    }

}
