package navin.com.java.ExceptionHandling.Practice;

import java.time.LocalDate;

public class Person {
    private Long id;
    private String name;
    private String gennder;
    private LocalDate dateOfBirth;

    public Person(Long id, String name, String gennder, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gennder = gennder;
        this.dateOfBirth = dateOfBirth;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGennder() {
        return gennder;
    }

    public void setGennder(String gennder) {
        this.gennder = gennder;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gennder='" + gennder + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
