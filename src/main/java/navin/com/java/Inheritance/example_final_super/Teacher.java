package navin.com.java.Inheritance.example_final_super;

public class Teacher extends Persons {

    private  double salary;
    protected String nationality = "USA";
    final int HOUR = 30;

    public Teacher(){
        super("Dara","Male",22);
        this.salary  = 30.0;
//        this.hour = 60;
    }

    @Override
    public void showInfo() {
        System.out.println("Teacher Class");
    }

    public void displayNationality(){
        System.out.println(super.nationality);
    }

    String info(){
        return "Name: " + name + " | Gender: " + gender + " | Age" + age +" | Salary" +salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ ", salary" + salary;
        //        return "Teacher{" +
//                "name='" + name + '\'' +
//                '}';
    }
}
