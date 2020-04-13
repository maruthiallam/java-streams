package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(50);
        arrayList.add(203);
        arrayList.add(40);
        arrayList.add(43);
        arrayList.add(143);
        System.out.println(arrayList);
        /**
         * We go for Streams concept only if you are going to process objects from the collection.
         * Call stream() on the collection. filter(Predicate) Predicate is a boolean valued function.
         * Filter: If input = 10 elements then Output can be <=10.
         * Here we are not generating a new object but filtering based on whether it is even.
         * In this case we go for filter method. Finally collect all the filtered objects to desired type.
         * Advantage: Less lines of code. If not streams then the workaround would be we have to iterate through each object, perform logic
         * then if the coditions are satisfied store in new collection which requires mores lines of code.
         */
        List<Integer> filteredList = arrayList.stream().filter(i->(i%2) == 0).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
