package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArray {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(13);
        l.add(40);
        System.out.println("list is:" + l);
        /**
         * For toArray() we have to create array object and we need to pass it to toArray.
         * Integer[]::new -?Meaning is convert the elements present in stream()  to Integer array.
         * Sample :: new -> Its going to create and return Sample object
         * Integer[]::new --> Its going to return Integer array object
         *
         * Here forEach method is not applicable since we can use forEach() only on streams but here we are getting an Integer array.
         * So array elements can be printed only by using for each loop and not forEach method.
         * This is converting ArrayList to an array of Integers
         */
        Integer[] i = l.stream().toArray(Integer[]::new);
        for(Integer i1:i){
            System.out.println(i1);
        }

        /**
         * Inorder to use forEach() method for the above example we have to do the following. 1st convert Integer array to stream and call forEach
         * to print.
         *
         */
        Stream.of(i).forEach(System.out::println);

        /**
         * Streams are not only used when you have Collections. We can also use when we have group of values
         */

        //converting group of Integer elements into a Stream. Then we can apply all the streams pre-defined methods
         Stream<Integer> s = Stream.of(9,99,999,9999);
         s.forEach(System.out::println);
    }
}
