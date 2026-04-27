package navin.com.java.ClassandObject;

public class Car {
    String color;
    int numberOfWheel;
    double price;
    boolean isDriving;

    void drive2(){
        System.out.println("Car is drive");
    }
    void info(){
        System.out.println("Color="+color+"; Number of wheel="+numberOfWheel+";Price="+price);
    }
    void info2(){
        System.out.println("V2 Color=%s Number of wheel=%d Price=%f".formatted(color,numberOfWheel,price));
    }

    void info3(){
        System.out.println(String.format("V3 Color=%s Number of wheel=%d Price=%f",color,numberOfWheel,price));
    }

    void drvie(){
        isDriving = true;
    }
    void stop(){
        isDriving = false;
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.color ="Red";
        car.numberOfWheel = 4;
        car.price = 2000;
//
//        car.info();
//        car.info2();
//        car.info3();
        System.out.println(car.isDriving);
        car.drvie();
        System.out.println(car.isDriving);
        car.stop();
        System.out.println(car.isDriving);
    }
}
