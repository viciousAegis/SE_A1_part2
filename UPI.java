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

    public double getBalance() {
        return 0.0;
    }

    // Method to make a payment
    public boolean makePayment(int amount) {
        // Implementation specific to UPI payment logic
        // For simplicity, assume upi's balance is stored in balance
        double balance = getBalance();

        if(balance >= amount) {
            return true;
        }
        else   {
            return false;
        }
    }
}
