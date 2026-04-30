package navin.com.java.Polymorphism;

public abstract class Shape implements Comparable<Shape>{


    abstract double getArea();

    abstract String getType();

    public void display(){
        System.out.println(getType()+","+getArea());
    }

    public void draw(){
        System.out.println("Draw Shape");
    }

    @Override
    public int compareTo(Shape other) {
        return other.getType().compareTo(this.getType());
//        return (int) (other.getArea() - this.getArea());
    }
}
