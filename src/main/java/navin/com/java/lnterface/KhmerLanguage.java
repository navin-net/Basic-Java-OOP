package navin.com.java.lnterface;

public class KhmerLanguage implements Language{
    @Override
    public void greeting() {
        System.out.println("សួស្តី");
    }

    @Override
    public void introduce(String name) {
        System.out.println("ខ្ងុំ "+name);
    }
}
