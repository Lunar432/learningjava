package learningjava;

import java.util.Scanner;

public class HA2_prob3 {
    //Find largest and smallest elements for each column of 2D array
    public static void main(String[] args) {
        //creating object for taking input
        Scanner obj = new Scanner(System.in);
        //taking input for 2D array
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
        //call method to find largest numbers in each column
        LargestColumn(array,m,n);
        System.out.println();
        //call method to find smallest numbers in each column
        SmallestColumn(array,m,n);
        obj.close();
    }
    public static void LargestColumn(int[][] num, int m, int n) {
        //outer loop until column number
        for (int j = 0; j < n; j++) {
            //initialize first element as max in every column
            int max = num[0][j];
            for (int i = 0; i < m; i++) {
                if (num[i][j] > max) {
                    //value of max is reassigned if greater number exists
                    max = num[i][j];
                }
            }
            //printing largest in every column
            System.out.println("Largest number of column " +j+" is: "+ max);
        }
    }

    public static void SmallestColumn(int[][] num, int m, int n) {
        //outer loop until column number
        for (int j = 0; j < n; j++) {
            //initialize first element of array as min in every column
            int min = num[0][j];
            for (int i = 0; i < m; i++) {
                if (num[i][j] < min) {
                    //value of min is updated if a smaller number exists
                    min = num[i][j];                  
                }
            }
            //printing smallest in every column
            System.out.println("Smallest number of column " +j+" is: "+min);

        }
    }
    
}
