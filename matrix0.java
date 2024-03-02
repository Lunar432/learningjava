package learningjava;
import java.util.Scanner;
public class matrix0 {
    //taking input and printing 2D array
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int m = inp.nextInt();
        System.out.println("Enter column size");
        int n = inp.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix elements: ");
        for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0 ; j < matrix[i].length ; j++){
                matrix[i][j] = inp.nextInt();
            }
        }
        System.out.println("Matrix elements are: ");
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        inp.close();

    }
    
}
