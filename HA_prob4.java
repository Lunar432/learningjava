package learningjava;
import java.util.Scanner;

public class HA_prob4 {
    //shift positions by a specified number
    public static void main(String[] args) {
        //object for taking input
        Scanner sc = new Scanner(System.in);
        //declaring and initializing 
        int array[] = {12,34,23,13,90};
        int n = array.length;
        //taking input for number of shift position
        System.out.print("Enter number of positions to shift: ");
        int x = sc.nextInt();
        //outer loop runs to shift each time
        for(int i=1;i<=x;i++){
            int temp = array[n-1];
            for(int j=(n-1);j>0;j--){
                //shifting of array elements to right
                array[j]= array[j-1];
            }
            array[0]= temp;
        }
        //printing of shifted array by loop
        System.out.println("Shifted array is: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]+"  ");
        }
        sc.close();
    }
}
