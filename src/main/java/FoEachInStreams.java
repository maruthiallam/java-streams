package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FoEachInStreams {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(13);
        l.add(40);
        System.out.println("list is:"+l);
        l.stream().forEach(System.out::println);

        /**
         * Meaning::If I give i, what you have to do is give a square of i.
         */
        Consumer<Integer> f = i->{
            System.out.println("Square of" +" " +i+ " "+ "is:"+i*i);
        };
        /**
         * For every element in stream you can apply some common logic by calling the
         * function defined above with its object reference.
         */
        l.stream().forEach(f);

        /**
         * The above example can also be written as
         */
        l.stream().forEach(i-> {System.out.println("Square of i:"+i*i);});
    }
}
