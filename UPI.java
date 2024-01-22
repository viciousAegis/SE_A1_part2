import java.util.*;

public class UPI {
    private String upiId;

    // Setter and Getter methods for upiId
    public void setUPIId(String upiId) {
        this.upiId = upiId;
    }

    public String getUPIId() {
        return upiId;
    }

    // Method to make a payment
    public boolean makePayment(int amount) {
        // Implementation specific to UPI payment logic
        // For simplicity, assume upi's balance is stored in balance
        double balance;

        if(balance >= amount) :
            return true;
        else    
            return false;
    }
}
