package navin.com.java.Polymorphism;

public class Circle extends Shape{
    private double r;


    public Circle(double r){
        super();
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * r*r;
    }


    @Override
    String getType() {
        return "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle is Drawing");
    }

    public void draw(double radius){
        System.out.println("Draw circle with radius="+ radius);
    }

}
