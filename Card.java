import java.util.*;

abstract class Card {
    private String cardNumber;
    private int cvv;
    private String expiryDate;

    // Setter and Getter methods for cardNumber
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    // Setter and Getter methods for cvv
    public void setCVV(int cvv) {
        this.cvv = cvv;
    }

    public int getCVV() {
        return cvv;
    }

    // Setter and Getter methods for expiryDate
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // Abstract method for making a payment
    public abstract boolean makePayment(int amount);
}

class CreditCard extends Card {
    private int creditLimit;

    // Setter and Getter methods for creditLimit
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    // Implementation of the abstract makePayment method
    @Override
    public boolean makePayment(int amount) {
        // Implementation specific to credit card payment logic
        return amount <= creditLimit;
    }
}

class DebitCard extends Card {
    private int balance;

    // Setter and Getter methods for balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    // Implementation of the abstract makePayment method
    @Override
    public boolean makePayment(int amount) {
        // Implementation specific to debit card payment logic
        return amount <= balance;
    }
}
