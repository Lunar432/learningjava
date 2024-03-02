package learningjava;
import java.util.Scanner;
import java.lang.Math;
public class matrix8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter 3X3 Array elements: ");
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
        int randRowInd = 0,randColInd = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                randRowInd =(int)(Math.random()*(matrix.length));
                randColInd = (int)(Math.random()*matrix[i].length);
                //shuffle randomly by swapping to random indices 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[randRowInd][randColInd];
                matrix[randRowInd][randColInd] = temp;
                
            }
        }
        System.out.println("Shuffled array elements are: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        inp.close();
    }
    
}
