package ro.scoalainformala.model;

import java.util.Objects;
import java.util.UUID;

public class Student implements Comparable<Student> {

    private UUID id;
    private String name;
    private String department;
    private int age;
    private int cnp;

    public Student(String name, String department, int age, int cnp) {
        id = UUID.randomUUID();
        this.name = name;
        this.department = department;
        this.age = age;
        this.cnp = cnp;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "This student's name is " + name + " and he/she studies at " + department + " " + id;
    }

    @Override
    public int compareTo(Student s) {
        return this.name != null ? (s.name != null ? this.name.compareTo(s.name) : 1) : -1;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Student student) {
            return student.getCnp() == cnp;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
