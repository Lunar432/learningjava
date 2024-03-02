package learningjava;
import java.util.Scanner;
public class matrix1 {
    //sum of all elements
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int m = inp.nextInt();
        System.out.println("Enter column size: ");
        int n = inp.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter Matrix elements: ");
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                matrix[i][j] = inp.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Matrix elements are: ");
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]+"  ");
                sum+= matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all elements is: "+sum);
        inp.close();
    }
    
}
