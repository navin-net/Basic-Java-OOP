package navin.com.java.homework;

public class Student {
    private String name;
    private String gender;
    private int age;

    public String toString(){
        return "Name " + name + "gender " + gender + "age " +age;
    }


    // Setter methods
    public void setName(String n){
        this.name = n;
    }

    public void setGender(String g){
        this.gender = g;
    }

    public void setAge(int a){
        this.age = a;
    }

    // Getter methods
    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

}
