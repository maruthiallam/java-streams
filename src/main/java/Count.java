package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(203);
        marks.add(10);
        marks.add(43);
        marks.add(143);
        System.out.println(marks);
        /**
         * Processing by count.
         */
        long failedStudents = marks.stream().filter(i->i<35).count();
        System.out.println(failedStudents);
    }
}
