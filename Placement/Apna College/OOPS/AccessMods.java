public class AccessMods {


    public static void main(String[] args) {
      BankAccount b1 = new BankAccount();
      b1.username ="pranav";
      b1.setPassword("ashish");

    }

}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

