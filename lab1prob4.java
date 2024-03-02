import java.util.Scanner;
public class lab1prob4 {
    public static void main(String[] args){
        //creating object input of scanner class
        Scanner input = new Scanner(System.in);
        int x;
        double curr;
        //running loop for menu until exit condition is fulfilled
        do{
        //input for choice is taken     
        System.out.println("Currency Exchange Menu");
        System.out.println("0: USD to BDT");
        System.out.println("1:BDT to USD");
        System.out.println("2:Exit");
        x = input.nextInt();
        switch(x){
            //usd to bdt conversion
            case 0:
            System.out.println("Enter currency:");
            curr = input.nextDouble();
            double bdt = (curr*108.93);
            System.out.printf("%f Tk in BDT",bdt);
            break;
            //bdt to usd conversion
            case 1:
            System.out.println("Enter currency:");
            curr = input.nextDouble();
            double usd = (curr/108.93);
            System.out.printf("%f in USD",usd);
            break;
            //exit condition
            case 2:
            System.exit(0);
        }
        }while(x!=2);
        input.close();
    }
    
}
