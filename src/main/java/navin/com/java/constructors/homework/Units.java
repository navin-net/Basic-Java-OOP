package navin.com.java.constructors.homework;
import java.util.Scanner;

public class Units {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(String label){
        System.out.println(label);
        return scanner.nextLine();
    }

    public double getDouble(String label){
        String text = getString(label);
        return Double.parseDouble(text);

    }

    public Integer getInteger(String label){
        String text = getString(label);
        return Integer.parseInt(text);
    }

}
