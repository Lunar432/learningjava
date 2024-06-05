package learningjava;
import java.io.*;
public class lab09_prob2 {
    public static void main(String[] args) {
        try(
        DataOutputStream w = new DataOutputStream(new FileOutputStream("Lab08_02.dat"));
        ){
            for(int i=0;i<100;i++){
                int rNum = (int) (0+Math.random()*100);
                w.writeInt(rNum);
                w.writeUTF(" ");
            }
            w.close();
            System.out.println("100 random integers written to Lab08_02.dat");
        } catch(FileNotFoundException e){
            System.out.println("Error writing to file: "+e.getMessage());
        } catch(IOException e){
            System.out.println("Error writing to file: "+e.getMessage());
        }
    }
}
