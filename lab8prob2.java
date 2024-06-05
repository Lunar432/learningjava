package learningjava;

import java.util.Scanner;

class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}

class Product{
    private int weight;

    public Product(){}

    public Product(int w){
        this.weight = w;
    }
    public void productCheck(int weight) throws MyException {

        if(weight<100){
            MyException m = new MyException("Product is invalid");
            throw m;
        }
        System.out.println("Weight of the product: " + weight); 
    }
}

public class lab8prob2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        try{
        Product p = new Product();
        System.out.println("Enter weight: ");
        int w = inp.nextInt();
        p.productCheck(w);
        } catch(MyException e){
            System.out.println("Error: "+e.getMessage());
        }
        inp.close();
    }
}


