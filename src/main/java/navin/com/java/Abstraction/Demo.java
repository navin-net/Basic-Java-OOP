package navin.com.java.Abstraction;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        English english = new English();
        Khmer khmer = new Khmer();
        Language.SwitchLang();
        english.Change();
        khmer.Change();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Choose language (en/kh) or type 'exit' to stop: ");
        String lang = sc.nextLine();

        if (lang.equalsIgnoreCase("en")) {
            System.out.println("Switching to English...");
            english.Change();

        } else if (lang.equalsIgnoreCase("kh")) {
            System.out.println("Switching to Khmer...");
            khmer.Change();

        } else if (lang.equalsIgnoreCase("x")) {
            System.out.println("Goodbye!");
            break; // stop the loop

        } else {
            System.out.println("Invalid choice! Try again.");
        }
    }sc.close();

    }

}
