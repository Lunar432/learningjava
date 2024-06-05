package learningjava;
import java.io.*;
import java.util.*;

class NegativeValueException extends Exception{
    public NegativeValueException(String str){
     super(str);
    }
 }
class Shape<T>{
    private T ShapeInfo;
    private double area, volume;

    public Shape(){}

    public Shape(T sInfo,double a,double v) throws NegativeValueException{
        this.ShapeInfo = sInfo;
        this.area = a;
        this.volume = v;
        checkNeg(a);
    }

    public void setSinfo(T sInfo){
        this.ShapeInfo = sInfo;
    }

    public void setArea(double a) throws NegativeValueException{
        checkNeg(a);
        this.area = a;
    }

    public void setVolume(double v){
        this.volume = v;
    }

    public T getsInfo(){
        return ShapeInfo;
    }

    public double getArea(){
        return area;
    }

    public double getVolume(){
        return volume;
    }

    public String toString(){
        return ("Shape Information: "+ShapeInfo+"\nArea: "+area+"\nVolume: "+volume);
    }

    public void checkNeg(double a) throws NegativeValueException{
        if(a<0){
            throw new NegativeValueException("Area can not be negative");
            
        } 
    }
}

public class genericsp1 {

    public static void main(String[] args) throws NegativeValueException {
        try{
        Shape <String> s1 = new Shape <String>("Circle",50,80);
        Shape <Double> s2 = new Shape <Double>(45.5,79,200);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        } catch( NegativeValueException c){
            System.out.println(c.getMessage());
        }
    }
}
