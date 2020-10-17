package FinalExam;

public abstract class Account {
    /**
     *
     * id: mã thẻ
     * balance: giá trị trong thẻ
     *  rate: lãi vay
     *
     */
    private int id;
    private double balance;
    private double lend;
    private double rate;


    Account(int id,double balance){
        setBalance(balance);
        setId(id);
    }


    public void deposit(double amount){
        this.balance += amount;
    }


    public void withdraw(double amount){
        if(balance < amount && amount >0){
            throw new IllegalArgumentException("Số dư không đủ");
        }
        else {
            balance -= amount;
        }
    }

    public double lenMoney(double lend){
        return this.balance -= lend + lend * rate;
    };

    public abstract double monthlyInterest();

    public abstract void showInfo();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLend() {
        return lend;
    }

    public void setLend(double lend) {
        this.lend = lend;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
