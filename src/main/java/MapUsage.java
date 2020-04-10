package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapUsage {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(203);
        marks.add(40);
        marks.add(43);
        marks.add(143);
        System.out.println(marks);
        /**
         * We used filter in this usecase since we processed each object and generated a new object.
         * Map: If input = 10 elements then Output should contain 10 elements.
         */
        List<Integer> filteredList = marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
