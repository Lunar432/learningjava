package learningjava;
import java.util.Scanner;
public class matrix7 {
    //smallest index of the largest element
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
        int max = matrix[0][0];
        int minRowInd = 0;
        int minColInd = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                    minRowInd = i;
                    minColInd = j;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == max){
                    if(i < minRowInd){
                       minRowInd = i;
                    }
                    if(j < minColInd){
                       minColInd = j;
                    }
                }
            }
        }
        System.out.println("Smallest row index "+minRowInd+" of largest element");
        System.out.println("Smallest column index "+minColInd+" of largest element");
        inp.close();
    }

    
}
