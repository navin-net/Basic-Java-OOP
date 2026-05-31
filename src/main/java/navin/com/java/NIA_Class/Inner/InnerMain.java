package navin.com.java.NIA_Class.Inner;

public class InnerMain {

    public static void main(String[] args) {
        Computer com1 = new Computer("Dell");

        Computer.CPU cpu1 = com1.new CPU(9,"Core");

        Computer.Ram ram1 = new Computer.Ram(1);

//        com1.display();
        cpu1.info();
        ram1.show();










    }
}
