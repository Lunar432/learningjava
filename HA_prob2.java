package learningjava;
import java.util.Scanner;
public class HA_prob2 {
    //sorting in descending order
    public static void main(String[] args) {
        //object for taking input
        Scanner sc = new Scanner(System.in);
        //declaring and intializing
        int temp=0;
        //take input for array
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<5;i++){
           num[i] = sc.nextInt();
        }
        System.out.println("Sorted array is: ");
        //outer loop 
        for(int i=0;i<num.length;i++){
            //inner loop 
            for(int j=i+1;j<num.length;j++){
                //condition to check for greater values than each element
                if(num[j]>num[i]){
                //swapping
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                }
            }
            //printing sorted array
            System.out.print(num[i]+"  ");
        }
        sc.close();  
    }
}
