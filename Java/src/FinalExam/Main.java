package FinalExam;


public class Main {
    public static void main(String[] args){
        Bank b = new Bank();
        User u = new User(1,"a","123","asd@gmail.com","ccx","12334");
        User x = new User(1,"a","123","asd@gmail.com","ccx","12334");
        b.signUp(u);
        b.signUp(u);
        b.signIn("abc@gmail.com","123456");

       b.showUser("abc@gmail.com");
//
       x.openSavingsAccount(100000.0);
//       x.openCheckingAccount(10000000000.0);
       x.deposit("asd@gmail.com",30000.0);
       x.getInterest("asd@gmail.com");



    }
}
