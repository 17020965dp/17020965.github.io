package bank;

public class CurrentPlusAccount extends CurrentAccount {
    private double minimumBalance;
    private double annuallyRate;

    public CurrentPlusAccount(String id, double balance, double charge, double minimumBalance, double annuallyRate) {
        super(id, balance, charge);
        this.minimumBalance = minimumBalance;
        this.annuallyRate = annuallyRate;
    }

    @Override
    public double monthlyInterest() {
        if (!(getBalance() > minimumBalance))
            return 0;
        return getBalance() * annuallyRate / 12.0;
    }
}
