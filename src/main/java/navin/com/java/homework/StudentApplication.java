package navin.com.java.homework;

public class StudentApplication {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
//        Student st = studentService.createStudent();
//        System.out.println(st.getName()+" "+st.getGender()+" "+ st.getAge());

        int numberOfStudent = 2;
        Student[] studentArray = studentService.CreateStudentArray(numberOfStudent);
//        for (int i = 0; i < numberOfStudent; i++) {
//            System.out.println(studentArray[i].getName()+" "+studentArray[i].getGender()+" "+studentArray[i].getAge());
//            System.out.println(studentArray[i].toString());
//        }

        studentService.print(studentArray);
//        studentService.sortByName(studentArray);
//        studentService.sortByAge(studentArray);
//        System.out.println("after sorting");
//        studentService.print(studentArray);
        System.out.println("++++++OldTest Student");
        Student oldestStudent = studentService.getOldestStudent(studentArray);
        System.out.println(oldestStudent.toString());
        
    }
}
