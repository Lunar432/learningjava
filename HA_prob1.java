package learningjava;

public class HA_prob1 {
    //finding minimum number of an array
    public static void main(String[] args) {
        //declaring and initializing
        int arr[] = {26,49,38,24,83};
        int index,i,min;
        //putting first value of array as temporary min value
        min = arr[0];
        index = 1;
        //running loop to check for smaller values
        for(i=0;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
                index=i+1;
            }
        }
        //printing the minimum number and index
        System.out.println("Minimum number is:"+ min);
        System.out.println("Index of minimum number is:"+ index);
    }
}
