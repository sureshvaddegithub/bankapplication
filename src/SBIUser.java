import java.util.UUID;
import java.util.Objects;

public class SBIUser implements BankInterface{


    private String AccountNO;
   public String name;

   public static float rateOfInterest;

   private int balance;

   private String password;


    public SBIUser(String name, String password,int balance) {
        this.name = name;
        this.password=password;
        this.balance = balance;
        this.AccountNO = String.valueOf(UUID.randomUUID());
    }

    public String getAccountNO() {
        return AccountNO;
    }

    public int getBalance() {
        return balance;
    }



    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMOney(int money) {
        balance = balance+money;
        return "successfully added money "+money+". Your total balance is "+balance+".";
    }

    @Override
    public String withDrawMoney(int money,String enteredpassword) {



        if (password.equals(enteredpassword)) {
            if (money > balance) {
            return "balance is not enough to withdraw";
            } else {
                balance -= money;
                return "success withdraw your money " + money;
              }
        }
        else{
            return "incorrect password";
        }
    }

    @Override
    public float calculateInterest(int years) {
        return (float)balance*years*rateOfInterest/100;
    }
}
