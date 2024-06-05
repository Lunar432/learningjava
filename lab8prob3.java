package learningjava;

import java.util.Scanner;
import java.util.Random;

public class lab8prob3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[100];
        for(int i=0;i<100;i++){
            arr[i] = (int) (0+Math.random()*100);
        }
        System.out.println("Enter array to find element: ");
        try{
        int in = inp.nextInt();
        if(in> arr.length || in<0){
            throw new ArrayIndexOutOfBoundsException("Out of Bounds!");
        }
        System.out.println("Value at "+in+" is "+arr[in]);
    } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
    }
    inp.close();
    }
}
