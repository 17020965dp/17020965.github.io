package FinalExam;



import java.util.ArrayList;


public class User {
    int id;
    String userName;
    String password;
    String email;
    String address;
    String phone;
    Role role;
    ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
    ArrayList<CheckingAccount> checkingAccounts = new ArrayList<>();

    public User(int id, String userName, String password, String email, String address, String phone) {
        setId(id);
        setUserName(userName);
        setPassword(password);
        setEmail(email);
        setAddress(address);
        setPhone(phone);
    }

    public void openSavingsAccount(double value){
        SavingsAccount s = new SavingsAccount(savingsAccounts.size()+1,value);
        savingsAccounts.add(s);
        System.out.println("mở tài khoản thành công");
    }

    public void openCheckingAccount(double value){
        CheckingAccount c = new CheckingAccount(checkingAccounts.size()+1,value);
        checkingAccounts.add(c);
        System.out.println("Mở tài khoản thành công");
    }

    public void withdraw(String email,double value){
        for(CheckingAccount c : checkingAccounts) {
            if(this.email == email){
                if(c.getBalance() < value){
                    System.out.println("Bạn k đủ tiền để rút");
                }
                else
                {
                    c.withdraw(value);
                    System.out.println("Rút tiền thành công, tài khoản của bạn còn: "+ c.getBalance());
                }
            }
        }
    }

    public void deposit(String email,double value){
        for(SavingsAccount s: savingsAccounts){
            if(this.email == email){
                if(value<200000.0){
                    System.out.println("Tiền nạp phải lớn hơn 20.000");
                }
                else {
                    s.deposit(value);
                    System.out.println("Nạp tiền thành công, tài khoản của bạn còn: " + s.getBalance());
                }
            }
        }
    }


    public void getInterest(String email){
        for(SavingsAccount s: savingsAccounts){
            if(this.email == email){
                s.setBalance(s.getBalance()*s.getInterest()/12.0);
                System.out.println("Lĩnh lãi thành công,tài khoản của bạn còn:" + s.getBalance());
            }
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ArrayList<SavingsAccount> getSavingsAccounts() {
        return savingsAccounts;
    }

    public void setSavingsAccounts(ArrayList<SavingsAccount> savingsAccounts) {
        this.savingsAccounts = savingsAccounts;
    }

    public ArrayList<CheckingAccount> getCheckingAccounts() {
        return checkingAccounts;
    }

    public void setCheckingAccounts(ArrayList<CheckingAccount> checkingAccounts) {
        this.checkingAccounts = checkingAccounts;
    }
}
