package navin.com.java.Inheritance;

public class Animal {
    protected String name;

    void setName(String name){
        this.name = name;
    }

     void showName(){
        System.out.println("Animal is name:"+name);
    }

    protected void eat(){
        System.out.println("Animal can eat");
    }

}
