package navin.com.java.NIA_Class.Inner;

public class Computer {
    public static CPU CPU;
    private static String model = "";

    public Computer(String model) {
        this.model = model;
    }

    public static void display(){
        System.out.println("This is a computer" + model);
    }



    protected class CPU{
        private int core;
        private String type;

        public CPU(int core, String type) {
            this.core = core;
            this.type = type;
        }

        public void info(){
//            System.out.println("Number of core=" + core);
//            System.out.println("CPU Type = " + type);
            System.out.println("Your Computer "+type + " " + core);
        }

    }




    static class Ram{
        private int memorySize;

        public Ram(int memorySize) {
            this.memorySize = memorySize;
        }

        public void show(){
            System.out.println("Your Computer Ram is"+ memorySize + "GB");
        }

    }

    
    


}
