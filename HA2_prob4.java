package learningjava;
import java.util.Scanner;
import java.lang.Math;
public class HA2_prob4 {
    //Shuffle elements randomly in 2D array
    public static void main(String[] args) {
        //create object for taking input
        Scanner obj = new Scanner(System.in);
        //take input of row column number and elements
        System.out.println("Enter number of rows: ");
        int m = obj.nextInt();
        System.out.println("Enter number of columns: ");
        int n = obj.nextInt();
        //initialize 2D array
        int[][] num = new int[m][n];
        System.out.println("Enter 2D array elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                num[i][j] = obj.nextInt();
            }
        }
        //random shuffling for row and column by loop
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //random index generate for row and column
                int randIndrow = (int)(Math.random()*(m));
                int randIndCol = (int)(Math.random()*(n));
                //swapping for row
                int tempRo = num[i][j];
                num[i][j] = num[randIndrow][j];
                num[randIndrow][j] = tempRo; 
                //swapping for column
                int tempCol = num[i][j];
                num[i][j] = num[i][randIndCol];
                num[i][randIndCol] = tempCol;
            }
        }
        //printing the shuffled 2D array
        System.out.println("Randomly shuffled 2D array is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        obj.close();
        
        
    }
    
}
