import java.util.List;

public class PaymentScheme {
    int x; // first x kilometers
    int y; // the cost of first x kilometers
    int z; // the cost of each kilometer after x kilometers

    // default constructor
    public PaymentScheme() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // constructor
    public PaymentScheme(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // functions
    public Boolean setPaymentScheme(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return true;
    }

    public List<Integer> getPaymentScheme() {
        List<Integer> paymentScheme = List.of(this.x, this.y, this.z);
        return paymentScheme;
    }
}
