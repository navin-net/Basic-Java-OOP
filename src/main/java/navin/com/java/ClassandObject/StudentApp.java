package navin.com.java.ClassandObject;

public class StudentApp {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Java";
        st1.gender = "Male";
        st1.setAge(-20);
        System.out.println(st1.toData());
    }
}
