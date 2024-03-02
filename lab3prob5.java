package learningjava;

import java.util.Scanner;

public class lab3prob5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        System.out.println("Enter 2D array input: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j] = inp.nextInt();
            }
        }
        System.out.println("Sort it by values in column: ");
        int n = inp.nextInt();
        for(int k = 0; k <matrix.length;k++){
        for(int i = 0; i < matrix.length-1;i++){
            for(int j = 0; j<(matrix.length-i-1);j++){
                if(matrix[j+1][k]<matrix[j][k]){
                //swapping
                int tempVal = matrix[j][k];
                matrix[j][k] = matrix[j+1][k];
                matrix[j+1][k] = tempVal;
                }

            }
        }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" "); 
            }
            System.out.println();
        }

    }

}
