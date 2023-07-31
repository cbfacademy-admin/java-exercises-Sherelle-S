package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy. LIST

            /*HashMap allows employee details to be stored in a list of key value pairs, thus ensuring that two employees with the same name will not be confused. two names can be the same but an employee id number is unique 
             * 
             * employees can be added and removed as they enter or leave the draw
             * 
             * i will then use Random() to randomly select a new winner for the draw selected by employee id to avoid name clash.
            */
        
        
        HashMap<String, Integer> EmployeeDraw = new HashMap<String, Integer>();

            System.out.println("The draw is now closed");
            EmployeeDraw.put("Ian", 103);
            EmployeeDraw.put("Charles", 104);
            EmployeeDraw.put("Sue", 105);
            EmployeeDraw.put("Jayden", 106);
            EmployeeDraw.put("Charles", 107);
            
            System.out.println("There are " +EmployeeDraw.size() +" entries into the draw.");
       
            int indexOfEmployee = (int)(Math.random()* 5) + 103; /* EmployeeDraw.size()); */
            System.out.println(EmployeeDraw.get(indexOfEmployee));

            Object[] randomEmployee = EmployeeDraw.keySet().toArray();
            Object key = randomEmployee[new Random().nextInt(randomEmployee.length)];
            System.out.println("This months winner is " + key + " : " + EmployeeDraw.get(key)+ " Congratulations!");

        

        /*2. WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique first names. SET

        for this list i wil be using a set, a set will return only a first instance of a name, if more than one person has the same name, it will only be returned once
        */

        HashSet<String> nameList = new HashSet<String>();

        nameList.add("Sarah");
        nameList.add("Peter");
        nameList.add("Sarah");
        nameList.add("Chris");

        System.out.println(nameList);

        /* 3. WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name. MAP
        
        map will allow employees to be stored in key value pairs*/ 



        // scanner.close();
        
            
        // }

        



        //  ArrayList<Integer> ints1 = new ArrayList<Integer>();
        //  ints1.add(5);
        //  ints1.add(3);
        //  ints1.add(4); 
        //  ints1.add(2);

        //  ArrayList<Integer> ints2 = new ArrayList<Integer>();
        //  ints2.add(6);
        //  ints2.add(4);
        //  ints2.add(6);
        //  ints2.add(1);

        //  System.out.println(ints1);

        //  System.out.println(ints2);
        // Set<Integer> combinedList = new HashSet<Integer>();
        // combinedList.addAll(ints1);
        // combinedList.addAll(ints2);

        // System.out.println(combinedList);
        // List<Integer> sortedList = new ArrayList<Integer>(combinedList);
        // // return combinedList;
        // Collections.sort(sortedList);

        // System.out.println(sortedList);
       
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

    private static void randomEmployee() {
    }
}
