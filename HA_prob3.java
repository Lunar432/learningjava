package learningjava;

public class HA_prob3 {
    //reverse elements of an array
    public static void main(String[] args) {
        //declare and initialize
        char letter[] = {'A','B','C','D','E','F'};
        int i,n= letter.length;
        //loop runs until middle of array
        for(i=0;i<(n/2);i++){
            //swapping
            char temp = letter[i];
            letter[i] = letter[n-1-i];
            letter[n-1-i] = temp;
            
        }
        //print reversed array using loop
        System.out.print("Reversed array is: ");
        for(i=0;i<letter.length;i++){
            System.out.printf(letter[i]+" ");
        }
    }
    
}
