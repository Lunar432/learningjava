package learningjava;

public class BankAccount {
    String account_number;
    String account_holder;
    double balance;

    BankAccount() {
    }

    BankAccount(String ac_num, String ac_h, double ba) {
        account_number = ac_num;
        account_holder = ac_h;
        balance = ba;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double wtdAmount) {
        if (balance > wtdAmount || balance == wtdAmount)
            balance -= wtdAmount;
    }

    public void deposit(double dpAmount) {
        balance += dpAmount;
    }

    public boolean Equals(BankAccount a){
        if(this.getBalance()==a.getBalance()){
            return true;
        }
        else{
            return false;
        }
    }

    public String display() {
        return ("Account Number:" + account_number + "\nAccount Holder:" + account_holder
                + "\nAccount Balance: " + balance);
    }
}
