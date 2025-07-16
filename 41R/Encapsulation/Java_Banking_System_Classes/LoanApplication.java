public class LoanApplication {
    private String customerName;
    private double loanAmount;
    private double interestRate;
    private int loanTerm;
    private double outstandingBalance;

    // Constructor
    public LoanApplication(String customerName, double loanAmount, double interestRate, int loanTerm) {
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.outstandingBalance = loanAmount;
        System.out.println("Loan Application Submitted");
    }

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public int getLoanTerm() { return loanTerm; }
    public void setLoanTerm(int loanTerm) { this.loanTerm = loanTerm; }

    public double getOutstandingBalance() { return outstandingBalance; }
    public void setOutstandingBalance(double outstandingBalance) { this.outstandingBalance = outstandingBalance; }

    // Methods
    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
        } else if (amount > outstandingBalance) {
            System.out.println("Payment exceeds loan balance");
        } else {
            outstandingBalance -= amount;
            System.out.println("Payment successful. Remaining Balance: " + outstandingBalance);
        }
    }

    public double calculateEMI() {
        double monthlyRate = interestRate / (12 * 100);
        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, loanTerm * 12)) /
                     (Math.pow(1 + monthlyRate, loanTerm * 12) - 1);
        return emi;
    }

    public void displayLoanDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Total Loan: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("EMI: " + calculateEMI());
        System.out.println("Remaining Balance: " + outstandingBalance);
    }
}
