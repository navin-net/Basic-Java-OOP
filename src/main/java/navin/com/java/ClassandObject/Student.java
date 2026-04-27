package navin.com.java.ClassandObject;

public class Student {
    String name;
    String gender;
    private int age;

    public void setAge(int a){
        if (a > 0) {
            age = a;

        }
    }

    String toData(){
        return "Name=" +name + "Gender=" + gender + "Age=" +age;
    }
}
