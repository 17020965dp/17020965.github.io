package bank;

public class CurrentAccount extends Account {
    private double charge;
    public CurrentAccount(String id, double balance, double charge) {
        super(id, balance);
        this.charge = charge;
    }

    @Override
    public double monthlyInterest() {
        return 0;
    }

    public void clearCheck(double amount) {
        deduct(amount + charge);
    }
}
