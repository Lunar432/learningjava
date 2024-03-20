package learningjava;

public class Rectangle {
    private double width, height;
    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double wd, double ht){
        width = wd;
        height = ht;
    }
    public void setWidth(double wd){
        width = wd;
    }

    public void setHeight(double ht){
        height = ht;
    }
    
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
    public double getArea(){
        double area = height*width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*(width+height);
        return perimeter;
    }

    
}
