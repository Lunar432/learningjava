package learningjava;

import java.util.*;

public class ShapeSort {
    public static <T> void sorting(ArrayList<Integer> list){
        Collections.sort(list);
    }
    public static void main(String[] args) {
       ArrayList<Integer> numList = new ArrayList<>();
       numList.add(9);
       numList.add(6);
       numList.add(4);
       numList.add(5);
       sorting(numList);  
       for(int c:numList){
        System.out.println(c);
       }
    }
}
