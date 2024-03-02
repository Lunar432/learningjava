package learningjava;
import java.util.Scanner;
public class TestBankAcc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        BankAccount bankAc1 = new BankAccount();
        String ownName;
        double balance;
        int id;
        System.out.println("Enter name of account holder: ");
        ownName = inp.nextLine();
        System.out.println("Enter Account ID");
        id = inp.nextInt();
        System.out.println("Enter balance of account: ");
        balance = inp.nextDouble();
        bankAc1.input(ownName,balance,id);
        bankAc1.display();
        System.out.println("Enter amount withdrawn: ");
        double wtdrAm = inp.nextDouble();
        bankAc1.withdraw(wtdrAm);
        System.out.println("Enter amount deposited: ");
        double dpAm = inp.nextDouble();
        bankAc1.deposit(dpAm);
        System.out.println("Total balance is: "+ bankAc1.checkBalance());
        inp.close();
    }
    
}

class BankAccount {
    String OwnerName;
    double balance;
    int id;
    void input(String n,double b,int i){
        OwnerName = n;
        balance = b;
        id = i;
    }
    void display(){
        System.out.println("Account Holder: "+ OwnerName);
        System.out.println("Account ID: "+ id);
        System.out.println("Account Balance: "+ balance);
    }
        
    void withdraw(double wtdrAmount){
        balance = balance - wtdrAmount;
    }
    void deposit(double dpAmount){
        balance = balance + dpAmount;
    }
    double checkBalance(){
        return balance;
    }
}
