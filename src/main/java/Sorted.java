package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(203);
        marks.add(40);
        marks.add(43);
        marks.add(143);
        System.out.println(marks);
        /**
         * Sorting based on natural sorting order. Default sorting is ascending order. Internally sorted method uses compareTo() of Comparable Interface
         */
//        List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList);

        List<Integer> naturalSortingOrder = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("naturalSortingOrder:"+naturalSortingOrder);

        List<Integer> reverseOfNaturalSortingOrder = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("reverseOfNaturalSortingOrder:"+reverseOfNaturalSortingOrder);

        List<Integer> reverseOfNaturalSortingOrderDifferentWay = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("reverseOfNaturalSortingOrderDifferentWay:"+reverseOfNaturalSortingOrderDifferentWay);


        List<Integer> sortedListNatural = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedListNatural:"+sortedListNatural);

        /**
         * Customised sorting. require objects in decreasing order
         */
        List<Integer> sortedListCustomised = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println("sortedListCustomised:"+sortedListCustomised);
    }
}
