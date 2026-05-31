package navin.com.java.NIA_Class.Anonymous;

public class Demo {

    static Shape sh1 = new Shape(){
        public void draw(){
            System.out.println("Drawing something");
        };
    };

    static Polygon p2 = new Polygon() {
        @Override
        public void info() {
            System.out.println("Hello");
        }
    };

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.draw();
        sh1.draw();

        p2.info();
    }


}
