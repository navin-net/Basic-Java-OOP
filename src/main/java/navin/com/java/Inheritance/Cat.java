package navin.com.java.Inheritance;

public class Cat extends Animal {

    void showInfo(){
        System.out.println("This is cats");
    }
//
//    protected void eat(){
//        super.eat();
//        System.out.println("Cat can eat");
//    }

    void displayName(){
        System.out.println("Animal is name:"+name);
    }

    void eat_all(){
        super.eat();
        System.out.println("TEST Hala");
        this.eat();
    }


    @Override
    void showName() {
        System.out.println("This cat is named"+name);
    }
}
