package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStringusingComparator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maruthi");
        names.add("Allam");
        names.add("Pinky");
        names.add("Bhavana");
        names.add("Sai Akhil");
        System.out.println("Names:"+names);

        /**
         * Here elements are sorted based on the length. If two objects have same length then they are sorted by Alphabetical order.
         */
        Comparator<String> c = (s1,s2)->{
            int l1 = s1.length();
            int l2 = s2.length();
            if(l1<l2) return -1;
            else if(l1>l2) return 1;
            else {
                return s1.compareTo(s2);
            }
        };
        List<String> naturalSortingOrder = names.stream().sorted(c).collect(Collectors.toList());
        System.out.println("naturalSortingOrder:"+naturalSortingOrder);
    }
}
