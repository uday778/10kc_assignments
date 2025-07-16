public class FixedDepositAccount {
    private String customerName;
    private double principalAmount;
    private double interestRate;
    private int duration;
    private double maturityAmount;

    // Constructor
    public FixedDepositAccount(String customerName, double principalAmount, double interestRate, int duration) {
        this.customerName = customerName;
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.duration = duration;
        System.out.println("Fixed Deposit Created Successfully");
    }

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public double getPrincipalAmount() { return principalAmount; }
    public void setPrincipalAmount(double principalAmount) { this.principalAmount = principalAmount; }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public double getMaturityAmount() { return maturityAmount; }

    // Methods
    public double calculateMaturityAmount() {
        maturityAmount = principalAmount * Math.pow((1 + interestRate / 100), duration);
        return maturityAmount;
    }

    public void withdrawBeforeMaturity() {
        if (duration < 1) {
            System.out.println("Cannot withdraw before one year");
        } else {
            double penalty = principalAmount * 0.02;
            System.out.println("Withdrawal before maturity. Penalty applied: " + penalty);
        }
    }
}
