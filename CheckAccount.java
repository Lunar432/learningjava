package learningjava;

public class CheckAccount {

    public static void main(String[] args) {
        BankAccount[] a = new BankAccount[5];
        a[0] = new BankAccount("456","Jack",50000);
        a[1] = new BankAccount("237","Ann",48000);
        a[2] = new BankAccount("456","Sam",55000);
        a[3] = new BankAccount("198","Jill",37500);
        a[4] = new BankAccount("479","Amy",40000);

        if(Compare(a[2],a[4])){
            System.out.println(a[2].getAccount_holder()+"has same blance as "
            +a[4].getAccount_holder());                                     
        }
        else{
            System.out.println(a[2].getAccount_holder()+"does not have same blance as "
            +a[4].getAccount_holder());                
        }

        if(a[1].Equals(a[3])){
            System.out.println(a[1].getAccount_holder()+"has same blance as "
            +a[3].getAccount_holder());                                     
        }
        else{
            System.out.println(a[1].getAccount_holder()+"does not have same blance as "
            +a[3].getAccount_holder());                
        }


    }
    
    public static boolean Compare(BankAccount a1,BankAccount a2){
        if(a1.getBalance()==a2.getBalance()){
            return true;
        }
        else{
            return false;
        }
    }
}
