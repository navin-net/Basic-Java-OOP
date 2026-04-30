package navin.com.java.static_keyword;

public class Demo {

    public static void main(String[] args) {
        Student s1 = new Student("Sa","Male",12);
        Student s2 = new Student("SaSa","FaMale",22);


        s1.setName("Ke");
        Student.numberOfStudent = 30;

        System.out.println(s1);
        System.out.println(s2);



    }

}
