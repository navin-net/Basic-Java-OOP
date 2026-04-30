package navin.com.java.Polymorphism;

public class Rectangle extends Shape{
    private final double width;
    private final double height;


    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    String getType() {
        return "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
