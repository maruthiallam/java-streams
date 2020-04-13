package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(13);
        l.add(40);
        l.add(3);
        l.add(13);
        l.add(312);
        l.add(30);
        System.out.println("list is l:"+l);
        List<Integer> list = l.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("list is:"+list);
    }
}
