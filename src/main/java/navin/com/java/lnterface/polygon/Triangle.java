package navin.com.java.lnterface.polygon;

public class Triangle implements Area, Perimeter{
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getArea() {
        double p = a+b+c/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        return area;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
