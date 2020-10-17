package FinalExam;

public class SavingsAccount extends Account{
    /**
     *
     * interest: tiền lãi
     *
     */
    private double interest = 10;

    SavingsAccount(int id, double balance) {
        super(id, balance);
        setInterest(interest);
    }




    @Override
    public double monthlyInterest() {
        return getBalance()*interest/12.0;
    }

    @Override
    public void showInfo() {
        System.out.println("Thông tin tài khoản của bạn là :");
        System.out.println("ID: " + this.getId() +"| Số dư: " + this.getBalance() + "| Tiền lãi hàng tháng: " + this.getInterest() + "%");
    }



    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
