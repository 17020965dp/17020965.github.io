package bank;

public abstract class Account {
    private String id;
    private double balance;
    private double interest;

    public Account(String id, double balance) {
        this.id = id;
        if (balance <= 0)
            throw new IllegalArgumentException("So du ko hop le");
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deduct(double amount) {
        if ((balance < amount) && (amount > 0))
            throw new IllegalArgumentException("So du khong du");
        balance -= amount;
    }

    public abstract double monthlyInterest();

    public double getBalance() {
        return balance;
    }
}

