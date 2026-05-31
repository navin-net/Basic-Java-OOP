package navin.com.java.CollectionsFramework.ArrayList.HomeWork;

public class SchoolApp {

    public static void main(String[] args) {
        School school = new School();

        school.setName("KEvin");

        Student st1 = new Student(1,"Dara",Gender.M);
        Student st2 = new Student(2,"Key",Gender.M);
        Student st3 = new Student(3,"Mac",Gender.M);
        Student st4 = new Student(4,"Fun",Gender.F);
        school.registerStudent(st1);
        school.registerStudent(st2);
        school.registerStudent(st3);
        school.registerStudent(st4);
//        System.out.println(school.getStudents());
//        school.displayStudents();

        school.sortByName();
        System.out.println("++++++After your Sort++++++++++");
        school.displayStudents();

        Student studentUpdate = new Student("Kevin",Gender.F);
        school.updateStudent(2,studentUpdate);
        System.out.println("++++++After your Update++++++++++");
        school.displayStudents();


        //Remove
/*
        school.removeStudent(2);
        System.out.println("=======After your remove==========");
        school.displayStudents();


        System.out.println("========= Search Student ============");
        Student foundStudent = school.findByName("Dara");
        if (foundStudent != null) {
            System.out.println(foundStudent.toString());
        }else {
            System.out.println("Not Found");
        }
*/




    }

}
