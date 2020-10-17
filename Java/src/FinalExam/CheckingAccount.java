package FinalExam;

public class CheckingAccount extends Account{

    /**
     *
     * check: phí thanh toán
     * minimum: số tiền tối thiểu thẻ phải có
     *
     */
    private double check;
    private double minimum=100000.0;
    private double lend;


    CheckingAccount(int id, double balance) {
        super(id, balance);
        setCheck(check);
        setMinimum(minimum);
    }


    @Override
    public double monthlyInterest() {
        if(getBalance()<minimum){
            return 0;
        }
        else {
            return getBalance();
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Thông tin tài khoản của bạn là: ");
        System.out.println("ID: " + getId() + "| Số dư: " + getBalance() +"| Phí thanh toán: " + getCheck() + " Số tiền tối thiểu thẻ phải có: " + getMinimum());
    }



    public void clearCheck(double amount){
        withdraw(amount+check);
    }

    public double getCheck() {
        return check;
    }

    public void setCheck(double check) {
        this.check = check;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getLend() {
        return lend;
    }

    public void setLend(double lend) {
        this.lend = lend;
    }
}
