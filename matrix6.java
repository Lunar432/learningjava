package learningjava;
import java.util.Scanner;
public class matrix6 {
    //column with largest sum
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int m = inp.nextInt();
        System.out.println("Enter column size: ");
        int n = inp.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter Array elements: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = inp.nextInt();
            }        
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            } 
            System.out.println();       
        }
        int[] sumCol = new int[matrix[0].length];
        for(int j = 0; j < matrix[0].length; j++){
            sumCol[j] = 0;
            for(int i = 0; i < matrix.length; i++){
                sumCol[j] += matrix[i][j];
            }
        }
        int sumColMax = sumCol[0];
        int colMaxInd = 0;
        for(int i = 0; i < matrix[0].length; i++){
            if(sumCol[i]>sumColMax){
                sumColMax = sumCol[i];
                colMaxInd = i;
            }
        }
        System.out.println("Column "+colMaxInd+" has largest sum "+sumColMax);
        inp.close();
    }
    
}
