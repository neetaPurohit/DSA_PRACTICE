package Oops;

public class AccessModifiers {

    static void main(String[] args) {
     BankAccount b1 = new BankAccount();
     b1.setUsername("nikz");
     b1.setPassword("#dfker"); //we only can set password using setter we can't access that password, to access we use getter
        
    }
}

class BankAccount{
    public String username;
    private String password;

    void setUsername(String userName){
        username = userName;
    }
    void setPassword(String Password){
        password = Password;
    }
}
