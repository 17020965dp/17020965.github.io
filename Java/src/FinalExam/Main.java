package FinalExam;


public class Main {
    public static void main(String[] args){
        Bank b = new Bank();
        User u = new User(1,"a","123","asd@gmail.com","ccx","12334");
        User x = new User(1,"a","123","asd@gmail.com","ccx","12334");
//        b.signUp(u);
//        b.signUp(x);
//        b.signIn("abc@gmail.com","3242");
//       b.showUser("abc@gmail.com");

        x.openSavingsAccount(100000.0);
        x.openCheckingAccount(10000000000.0);
        x.deposit("asd@gmail.com",10000.0);

    }
}
