package navin.com.java.method;

public class MethodOverLoadingDemo {

    public static void main(String[] args) {
//        printString("Welcome to me");

        printString("Amount",50);
        print(23,"Sa");
        printInteger(23);

        display("Code",23.1,50,1.10);

    }

    public static void display(String name,double...price){
        System.out.println(name);
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
        }
    }

    public static void printString(String text,int value){
        System.out.println(text + "=" + value);
    }

    public static void print(Integer value,String property){
        System.out.println(property+"="+value);
    }

    public static void printInteger(Integer integer){
        System.out.println(integer);
    }


}
