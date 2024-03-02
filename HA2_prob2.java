package learningjava;

import java.util.Scanner;

public class HA2_prob2 {
    //Find largest and smallest elements for every row of 2D array
    public static void main(String[] args) {
        //create object for taking input
        Scanner obj = new Scanner(System.in);
        //take input for 2D array
        System.out.println("Enter number of rows: ");
        int m = obj.nextInt();
        System.out.println("Enter number of columns: ");
        int n = obj.nextInt();
        //initialize 2D array
        int[][] array = new int[m][n];
        System.out.println("Enter 2D array elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = obj.nextInt();
            }
        }
        //print the 2D array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        //call method to find largest numbers in each row
        LargestRow(array,m,n);
        System.out.println();
        //call method to find smallest numbers in each row
        SmallestRow(array,m,n);
        obj.close();
        }
        
    public static void LargestRow(int[][] num, int m, int n) {
        //outer loop until row number
        for (int i = 0; i < m; i++) {
            //initialize first element as max in every row
            int max = num[i][0];
            for (int j = 0; j < n; j++) {
                if (num[i][j] > max) {
                    //value of max is updated if greater number exists
                    max = num[i][j];
                }

            }
            //printing largest in every row
            System.out.println("Largest number of row " +i+" is: "+ max);
        }
    }

    public static void SmallestRow(int[][] num, int m, int n) {
        //outer loop until row number
        for (int i = 0; i < m; i++) {
            //initialize first element as min in every row
            int min = num[i][0];
            for (int j = 0; j < n; j++) {
                if (num[i][j] < min) {
                    //value of min is updated if a smaller number exists
                    min = num[i][j];                  
                }
            }
            //printing smallest in every row
            System.out.println("Smallest number of row " +i+" is: "+min);

        }
    }
}

