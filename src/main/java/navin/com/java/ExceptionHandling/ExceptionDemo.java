package navin.com.java.ExceptionHandling;

public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("First Line");
        int a = 5;
        int b = 0;

        try {
            System.out.println("Before result");
            int result = a/b;
            System.out.println("Result= " +result);
        } catch (Exception e) {
            System.out.println("There is ArithmeticException occured");
            e.printStackTrace();
        }

        System.out.println("Second Line");


    }

}
