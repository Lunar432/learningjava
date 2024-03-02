package learningjava;
import java.util.Scanner;
import java.lang.Math;
public class HA_prob5 {
    //randomly shuffling elements of array
    public static void main(String[] args) {
        //object for taking input
        Scanner obj = new Scanner(System.in);
        //taking input for array
        System.out.println("Enter length of array: ");
        int n = obj.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            array[i] = obj.nextInt();
        }
        //loop 
        for(int i=0;i<array.length;i++){
            //generate random number in range of zero to array length
            int randInd = (int)(Math.random()*array.length);
            //swapping each elements with random index elements
            int temp = array[i];
            array[i] = array[randInd];
            array[randInd] = temp;
        }
        //printing randomly shuffled array
        System.out.println("Randomly shuffled array is: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        obj.close();
    }
}
