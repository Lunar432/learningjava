package learningjava;
import java.util.Scanner;
public class stat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] perc = new double[64];
        int count =0;
        System.out.println("Enter percentage: ");
        for(int i=0;i<perc.length;i++){
            perc[i] = inp.nextDouble();
            perc[i] = Math.floor(perc[i]);
        }
        int[] ind = new int[30];
        System.out.println("Enter number: ");
        int dig = inp.nextInt();
        for(int i=0;i<perc.length;i++){
            if((perc[i])==dig){
                ind[count]=i;
                count++;
            } 
        }
        System.out.println(count);
        System.out.println("Index of num:");
        for(int i=0;i<count;i++){
            System.out.println(ind[i]+1);
        }
        inp.close();
    }
    
}
