package FinalExam;



import java.util.ArrayList;

public class Bank {
    private String name;
    private String address;
    ArrayList<User> users = new ArrayList<>();

    public Bank(){
        this.users.add(new User(users.size()+1,"duong","123456","abc@gmail.com","bac giang","123456"));
        this.users.add(new User(users.size()+1,"duong","123456","xyz@gmail.com","bac giang","123456"));
        this.users.add(new User(users.size()+1,"duong","123456","mnx@gmail.com","bac giang","123456"));
    }

    public boolean signUp(User user){
        for(User u : users){
            if(user.getEmail().equals(u.getEmail())){
                System.out.println("Tài khoản đã tồn tại");
                return false;
            }

        }
        User u = new User(user.getId(), user.userName, user.password, user.email, user.getAddress(), user.getPhone());
        users.add(u);
        System.out.println("Tạo tài khoản thành công");
        return true;
    }


    public boolean signIn(String email,String password){
        for(User u :users){
            if(email.equals(u.getEmail()) && password.equals(u.getPassword())){
                System.out.println("Đăng nhâp thành công");
                return true;
            }
            else {
                System.out.println("Tài khoản ko hợp lệ");
                return false;
            }
        }
        return true;
    }

    public boolean showUser(String email){
        for(User u: users){
            if (email.equals(u.getEmail())) {
                System.out.println("Thông tin tài khoản : " + u.getEmail());
                return true;
            }
            else {
                System.out.println("Tài khoản không tồn tại");
                return false;
            }
        }
        return true;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }


}

