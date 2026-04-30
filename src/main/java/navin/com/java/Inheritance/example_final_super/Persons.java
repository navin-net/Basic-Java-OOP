package navin.com.java.Inheritance.example_final_super;

public class Persons {
    protected String name;
    protected String gender;
    protected int age;

    protected String nationality = "Cambodian";

    public Persons(String name, String gender) {
        this(name,gender,0);
    }

    public Persons(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }


    //FINAL METHO
    //Note if they change final metho you can not update anymore this is final keyword
//    public final void showInfo(){
    public void showInfo(){
        System.out.println("This is from Person class ");
    }

}
