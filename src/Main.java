import java.util.*;

public class Main {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
       System.out.println("Enter name  , password and initial balance of accountholder");

       // user name and initial balance
       String name = sc.nextLine();
       String enterpassword = sc.nextLine();
       int balance = sc.nextInt();
       SBIUser acc1 = new SBIUser(name, enterpassword ,balance);
       System.out.println( "your accountNO is " +acc1.getAccountNO());

      // add money
       System.out.println("Enter the money that you want to add");
       int money = sc.nextInt();
       acc1.addMOney(money);
       System.out.println( "new balance "+acc1.checkBalance());


       // withdraw money
       System.out.println("Enter the money to with draw,password");

       String password = sc.nextLine();

       System.out.println(acc1.withDrawMoney(22,password));



    }
}