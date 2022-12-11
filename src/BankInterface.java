public interface BankInterface {

    int checkBalance();

    String addMOney(int money);

    String withDrawMoney(int money,String password);

    float calculateInterest(int years);
}
