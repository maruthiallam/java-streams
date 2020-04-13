package main.java;

import java.util.ArrayList;
import java.util.List;

public class MinMaxInStreams {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(13);
        l.add(40);
        System.out.println("list is:"+l);
        /**
         * Natural sorting order which is ascending order
         */
        Integer minAscendingOrder = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("minAscendingOrder is:"+minAscendingOrder);
        Integer maxAscendingOrder = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("maxAscendingOrder is:"+maxAscendingOrder);

        /**
         * Reverse of default sorting oprder which is descending order.
         */
        Integer minDescendingOrder = l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println("minDescendingOrder is:"+minDescendingOrder);
        Integer maxDescendingOrder = l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println("maxDescendingOrder is:"+maxDescendingOrder);

    }
}
