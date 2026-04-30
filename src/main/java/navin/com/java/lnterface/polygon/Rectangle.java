package navin.com.java.lnterface.polygon;

public class Rectangle implements Area, Perimeter{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (height + width) * 2;
    }
}
