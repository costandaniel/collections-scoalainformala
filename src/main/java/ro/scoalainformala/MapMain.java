package ro.scoalainformala;

import ro.scoalainformala.model.Student;

import java.util.*;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> countries = new TreeMap<>(new StringComparatorByLength());

        countries.put("Romania", "+40");
        countries.put("England", "+44");
        countries.put("Spain", "+34");
        countries.put("Romania", "+1");

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

class StringComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
