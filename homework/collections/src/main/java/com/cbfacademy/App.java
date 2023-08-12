package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! \n" );


        // 1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy. LIST

            /*HashMap allows employee details to be stored in a list of key value pairs, thus ensuring that two employees with the same name will not be confused. two names can be the same but an employee id number is unique 
             * 
             * employees can be added and removed as they enter or leave the draw
             * 
             * i will then use Random() to randomly select a new winner for the draw selected by employee id to avoid name clash.
             * *HASHMAP**
            */
                System.out.println("List example with employee numbers as key value pairs");
                
                HashMap<String, Integer> EmployeeDraw = new HashMap<String, Integer>();

                    System.out.println("The draw is now closed");
                    EmployeeDraw.put("Ian", 103);
                    EmployeeDraw.put("Charles", 104);
                    EmployeeDraw.put("Sue", 105);
                    EmployeeDraw.put("Jayden", 106);
                    EmployeeDraw.put("Charles", 107);
            
       
            // get the random number like this so it knows to get values starting from employee number 103 and end at 107. let the code know the number of employees in the draw.
                // **LIST**

                    Object[] randomEmployee = EmployeeDraw.keySet().toArray();
                    Object key = randomEmployee[new Random().nextInt(randomEmployee.length)];
                    System.out.println("This months winner is " + key + " : Employee number " + EmployeeDraw.get(key)+ " Congratulations! \n");

            //**Refactored to meet the needs of the assignment. I will not be using a list** 

                        System.out.println("Simplified version of code without employee numbers");
                    List<String> namesForTheDraw = new ArrayList<String>();

                        namesForTheDraw.add("Ian Phillips");
                        namesForTheDraw.add("Charles Rodrigo");
                        namesForTheDraw.add("Sue Markey");
                        namesForTheDraw.add("Charles Mountbatten");
                        namesForTheDraw.add("Sarah Smith");

                        int max = namesForTheDraw.size();
                        int min = 0;
                        int range = max - min ;
        
        // generate random index within 1 to array size
            
                        int rand = (int)(Math.random() * range) + min;

                        System.out.println("There are " + namesForTheDraw.size() + " Employees in todays draw");
                        System.out.println("This months winner is " + namesForTheDraw.get(rand) + " Congratulations! \n");
        

        /*2. WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique first names. SET

        for this list i wil be using a set, a set will return only a first instance of a name, if more than one person has the same name, it will only be returned once
        */

                Set<String> nameList = new HashSet<String>();

                    nameList.add("Sarah");
                    nameList.add("Peter");
                    nameList.add("Sarah");
                    nameList.add("Chris");

                    System.out.println("The unique first names of employees are " + nameList+" \n");

        // 3. WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name. Map
        /*create a list of names
         * 
         */

                List<String>EmployeeNames = new ArrayList<String>();
                    EmployeeNames.add("Sarah");
                    EmployeeNames.add("Peter");
                    EmployeeNames.add("Sarah");
                    EmployeeNames.add("Chris");
                    EmployeeNames.add("Patrick");
                    EmployeeNames.add("Peter");
                    EmployeeNames.add("Charles");
                    EmployeeNames.add("Peter");

            
                HashMap<String, Integer> nameOccurenceCount = new HashMap<String, Integer>();

                    for(String name: EmployeeNames){
                        nameOccurenceCount.put(name, Collections.frequency(EmployeeNames, name));
                    }
        
                System.out.println("The occurence of employee names are as follows: " + nameOccurenceCount + " \n");
        // 4. WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport. QUEUE
        
        /* This will use a queue to create a first in first out queue, ensuring that the name will be selected in the order that they came*/

             Queue<String> waitingList = new PriorityQueue<String>();

                waitingList.add("Ian Phillips");
                waitingList.add("Charles Rodrigo");
                waitingList.add("Sue Markey");
                waitingList.add("Charles Mountbatten");
                waitingList.add("Sarah Smith");

                System.out.println("There are " + waitingList.size() + " people on the current waiting list.");
                System.out.println("The employee attending the next match is " + waitingList.poll());
                System.out.println("There are " + waitingList.size() + " people on the current waiting list.");



        

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
