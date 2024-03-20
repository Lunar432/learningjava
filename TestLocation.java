package learningjava;
import java.util.Scanner;
public class TestLocation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int m = inp.nextInt();
        int n = inp.nextInt();
        double arr[][] = new double[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = inp.nextDouble();
            }
        }
        Location loc = locateLargest(arr);
        System.out.println("The location of the largest element "+loc.maxValue+" is ("+loc.row+","+loc.column+")");
        inp.close();
    }

    public static Location locateLargest(double[][] arr){
        Location l = new Location();
        l.maxValue = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]> l.maxValue){
                l.maxValue =arr[i][j];
                l.row = i;
                l.column = j;
                }
            }
        }
        return l;
    }
    
}
