package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

         ArrayList<Integer> ints1 = new ArrayList<Integer>();
         ints1.add(5);
         ints1.add(3);
         ints1.add(4); 
         ints1.add(2);

         ArrayList<Integer> ints2 = new ArrayList<Integer>();
         ints2.add(6);
         ints2.add(4);
         ints2.add(6);
         ints2.add(1);

         System.out.println(ints1);

         System.out.println(ints2);
        Set<Integer> combinedList = new HashSet<Integer>();
        combinedList.addAll(ints1);
        combinedList.addAll(ints2);

        System.out.println(combinedList);
        List<Integer> sortedList = new ArrayList<Integer>(combinedList);
        // return combinedList;
        Collections.sort(sortedList);

        System.out.println(sortedList);
       
        // return new ArrayList<Integer>();

        // ArrayList<Integer> nums = new ArrayList<Integer>();
        //  nums.add(3);
        //  nums.add(4);
        //  nums.add(5);
        //  nums.add(6);
        //  nums.add(4);
        //  nums.add(2);
        //  System.out.println(nums);

        //  Set<Integer>hash_set = new HashSet<Integer>();
        //  hash_set.addAll(nums);

        //  System.out.println(hash_set);
        //  boolean dupesFound = nums.size() != hash_set.size();
        // System.out.println(dupesFound);
         
    }
}
