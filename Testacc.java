package learningjava;

public class Testacc {
    public static void main(String[] args) {
        Account ac = new Account(1122,20000,4.5);
        System.out.println("ID:"+ac.getID());
        System.out.println("Balance:"+ac.getbalance());
        System.out.println("Annual Interest Rate:"+ac.getannualInterestRate());
        System.out.println("Withraw Amount:"+2500);
        System.out.println("Deposit Amount: "+3000);
        ac.withdraw(2500);
        ac.deposit(3000);
        System.out.println("Balance: "+ac.getbalance());
        System.out.println("Monthly Interest: "+ac.getMonthlyInterest());
    }
}
