public class CreditCardAccount {
    private String customerName;
    private double creditLimit;
    private double currentDebt;
    private double interestRate;

    // Constructor
    public CreditCardAccount(String customerName, double creditLimit, double interestRate) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.currentDebt = 0;
    }

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public double getCreditLimit() { return creditLimit; }
    public void setCreditLimit(double creditLimit) { this.creditLimit = creditLimit; }

    public double getCurrentDebt() { return currentDebt; }
    public void setCurrentDebt(double currentDebt) { this.currentDebt = currentDebt; }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    // Methods
    public void swipeCard(double amount) {
        if (currentDebt + amount > creditLimit) {
            System.out.println("Transaction declined: Limit exceeded");
        } else {
            currentDebt += amount;
            System.out.println("Transaction successful. Current Debt: " + currentDebt);
        }
    }

    public void makePayment(double amount) {
        if (amount > currentDebt) {
            System.out.println("Excess payment not allowed");
        } else {
            currentDebt -= amount;
            System.out.println("Payment successful. Remaining Debt: " + currentDebt);
        }
    }

    public void applyInterest() {
        currentDebt += currentDebt * (interestRate / 100);
        System.out.println("Interest applied. Total Debt: " + currentDebt);
    }
}
