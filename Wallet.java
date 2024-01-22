// class Wallet {
//     - balance: double
//     - minBalance: double

//     + addMoney(amout: double): Boolean
//     + getBalance(): double
//     + deductMoney(amount: double): Boolean 
// }

public class Wallet {
    private double balance; // balance
    private double minBalance; // minimum balance

    // constructor
    public Wallet() {
        this.balance = 0;
        this.minBalance = 0;
    }

    // methods
    public Boolean addMoney(double amount) {
        // add money
        return true;
    }

    public double getBalance() {
        // get balance
        return 0;
    }

    public Boolean deductMoney(double amount) {
        // deduct money
        return true;
    }
    
}
