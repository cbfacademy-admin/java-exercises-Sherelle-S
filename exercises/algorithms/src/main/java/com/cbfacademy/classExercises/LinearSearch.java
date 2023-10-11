package com.cbfacademy.classExercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    //    Linear Search
    List<String>names = new ArrayList<>();
    // arraylist f names
    names.add("Adele");
    names.add("Maria");
    names.add("Patrick");
    names.add("Charles");
    names.add("Mark");

    try (Scanner scanner = new Scanner(System.in)) {
        // scanner element to allow user to search a name, surrounded in a try with resources which will close scanner when sort is complete.
        System.out.println("Please enter a name you are wishint to search for.");
        // user prompt for name
        String searchName = scanner.nextLine();
        // element to hold the name input
        boolean flag = false;
        // flag element which tells loop if it needs to run again

        for(int i = 0; i < names.size(); i++){
            // loop runs through every element int he names array
            
                if(names.get(i).equalsIgnoreCase(searchName)){
                    // if element at each index of the for loop equals the name being searched (ignore case allows name to be searched regardless of case)
                    System.out.println(searchName+" is found in the list at index "+i);
                    // system will print this if name is found along witht the index it was located at
                    flag = true;
                    // flag is changed to true 
                    break;
                    // we ask loop to break so it no longer needs to search for element
                }         
                // close the if statement
                            
            }
            // close the loop
            if(flag == false){
                // if the flag still remains flase
                    System.out.println(searchName+" cannot be found in this list.");
                    // we print this statement
            }
            // close if statement
        }catch(Exception e){
            // adding a generic catch block to try statement
            e.printStackTrace();
            // asks to print out where Exception occured for more information
        }
        // close catch block
        
    }
    // close main 
    
}
// close class
