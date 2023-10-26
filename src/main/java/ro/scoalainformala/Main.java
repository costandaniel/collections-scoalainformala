package ro.scoalainformala;

import ro.scoalainformala.model.Student;
import ro.scoalainformala.model.comparators.StudentComparatorByDepartment;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // "Program against interfaces instead of implementations."
        Set<Student> students = new TreeSet<>(new StudentComparatorByDepartment()); // type inference

        // pp. LinkedList are metoda reverse()
        // List nu contine metoda reverse()
        // nici ArrayList nu contine metoda reverse()
        Student mary = new Student("Mary", "CS", 19, 29908);
        students.add(mary);
        students.add(new Student("John", "Law", 18, 19911));

        students.add(new Student("Jimmy", "Arts", 20, 19910));

        Student john = new Student("John", "Law", 18, 19911);

        students.add(john);

        // Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);
        Collections.sort(numbers);
    }

    private static boolean exists(List<Student> list, Student s) {
        for (Student x : list) {
            if (x.getCnp() == s.getCnp()) {
                return true;
            }
        }
        return false;
    }
}
