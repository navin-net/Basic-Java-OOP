package navin.com.java.lnterface.polygon;

public class Application {


    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.calculatePerimeter());
//        rectangle.getArea();
//        System.out.println(rectangle.getArea());
//
//        Triangle triangle = new Triangle(1,2,3);
//        System.out.println(triangle.getArea());
//
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.calculatePerimeter());



    }

}
