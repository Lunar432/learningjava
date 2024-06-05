package learningjava;

//import java.io.*;

public class genericsp2 {
    public static <T> boolean checkValue(T[] ar1, T[] ar2){
        boolean sameArray = false;
        for(int i =0 ; i<ar1.length;i++){
            if(ar1[i]==ar2[i]){
                sameArray = true;
            } else{
                sameArray = false;
                break;
            }
        }
        return sameArray;
    }
    public static void main(String[] args) {
        String[] Array1 = {"A","B","C","D","E"};
        String[] Array2 = {"B","A","D","C","E"};
        for(String a: Array1){
            System.out.println(a);
        }
        for(String a: Array2){
            System.out.println(a);
        }
        if(checkValue(Array1,Array2)){
            System.out.println("The arrays are same");
        } else{
            System.out.println("The arrays are not same");
        }
    }
}
