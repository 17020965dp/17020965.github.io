package bank;

public class SavingsAccount extends Account {
    private double annuallyRate;

    public SavingsAccount(String id, double balance, double annuallyRate) {
        super(id, balance);
        this.annuallyRate = annuallyRate;
    }

    @Override
    public double monthlyInterest() {
        return getBalance() * annuallyRate / 12.0;
    }

    public void withdraw(double amount) {
        deduct(amount);
    }
}
