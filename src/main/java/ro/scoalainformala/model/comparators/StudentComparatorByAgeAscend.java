package ro.scoalainformala.model.comparators;

import ro.scoalainformala.model.Student;

import java.util.Comparator;

public class StudentComparatorByAgeAscend implements Comparator<Student> {
    public int compare(Student s1, Student s2) {

        return s1.getAge()!=s2.getAge() ? (s1.getAge()>s2.getAge() ? 1 : -1) : 0;
    }
}
