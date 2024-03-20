package learningjava;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rct1 = new Rectangle();
        Rectangle rct2 = new Rectangle();
        rct1 = new Rectangle(4,6.40);
        rct2 = new Rectangle(3.5,35.9);
        System.out.println("1st Rectangle:");
        System.out.println("Width:"+rct1.getWidth()+"\nHeight:"+rct1.getHeight());
        System.out.println("Area:"+rct1.getArea());
        System.out.println("Perimeter:"+rct1.getPerimeter());
        System.out.println();
        System.out.println("2nd Rectangle:");
        System.out.println("Width:"+rct2.getWidth()+"\nHeight:"+rct2.getHeight());
        System.out.println("Area:"+rct2.getArea());
        System.out.println("Perimeter:"+rct2.getPerimeter());
    }
    
}
