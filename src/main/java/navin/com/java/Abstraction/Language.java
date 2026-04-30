package navin.com.java.Abstraction;

public abstract class Language {
    protected String name;
    protected int id;

    public static void SwitchLang(){
        System.out.println("Switch Lang Is");
    }

    public abstract void Change();

}
