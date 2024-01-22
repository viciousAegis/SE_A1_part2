// class Student {
//     - fees: int
//     + addToFees(amount: double): Boolean
// }

public class Student extends User {
    private int fees; // fees

    // constructor
    public Student() {
        this.fees = 0;
    }

    // methods
    public Boolean addToFees(double amount) {
        // add to fees
        return true;
    }
    
}
