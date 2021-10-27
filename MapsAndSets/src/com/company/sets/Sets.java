package com.company.sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sets {

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Item1");
        arrList.add("Item2");
        arrList.add("Item3");
        arrList.add("Item4");
        arrList.add("Item5");

        arrList.forEach(System.out::println);

        HashSet myHashSet = new HashSet();
        myHashSet.add("hashItem1");
        myHashSet.add("hashItem1");
        myHashSet.add("hashItem2");
        myHashSet.add("hashItem3");
        myHashSet.add("hashItem4");
        myHashSet.add("hashItem3");

        myHashSet.forEach(System.out::println);

        //System.out.fore();
    }
}
