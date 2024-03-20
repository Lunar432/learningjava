package learningjava;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    Account(){
    }

    Account(int i,double bal,double annIR){
        id = i;
        balance = bal;
        annualInterestRate = annIR;
    }

    public void setId(int i){
        id = i;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annIR){
        this.annualInterestRate = annIR;
    }

    public int getID(){
        return id;
    }

    public double getbalance(){
        return balance;
    }

    public double getannualInterestRate(){
        return annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }

    public double getMonthlyInterest(){
        return balance*(getMonthlyInterestRate()/100);
    }

    public void withdraw(double wtdr){
        balance -= wtdr;
    }

    public void deposit(double dep){
        balance += dep;
    }
}
