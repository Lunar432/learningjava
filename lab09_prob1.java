package learningjava;
import java.io.*;

public class lab09_prob1 {
    public static void main(String[] args) {
        File file = new File("Lab08_01.txt");
        try(
        PrintWriter w = new PrintWriter(file);){
        for(int i=0;i<100;i++){
            int rNum = (int) (0+Math.random()*100);
            w.println(rNum+" ");
        } 
        System.out.println("100 random integers written to Lab08_01.txt");
        w.close();
    } catch(IOException e){
        System.out.println("Error writing to file: "+e.getMessage());
    }
    }
}
