// class Identification {
//     -aadharNumber: int
//     -pan: String

//     +setAadharNumber(int aadharNumber)
//     +getAadharNumber(): int
//     +setPan(String pan)
//     +getPan(): String
// }



public class Identification {
    private int aadharNumber; // aadhar number
    private String pan; // pan number

    public Identification() {
        this.aadharNumber = 0;
        this.pan = "";
    }

    // constructor
    public Identification(int aadharNumber, String pan) {
        this.aadharNumber = aadharNumber;
        this.pan = pan;
    }

    // methods
    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public int getAadharNumber() {
        return this.aadharNumber;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPan() {
        return this.pan;
    }
    
}
