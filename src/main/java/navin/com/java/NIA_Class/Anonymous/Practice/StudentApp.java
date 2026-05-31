package navin.com.java.NIA_Class.Anonymous.Practice;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("1",122),new Student("2",10),new Student("3",399),
        };

        for (Student st: students){
            System.out.println(st);
        }

        System.out.println("++++++++++");
//        Arrays.sort(students, new SortByAge());

        Comparator<Student> sortByAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };

        Arrays.sort(students, sortByAge);

        for (Student st : students){
            System.out.println(st);
        }
    }

}
