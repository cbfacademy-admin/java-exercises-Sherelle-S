package com.cbfacademy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    //    Linear Search
    List<String>names = new ArrayList<>();
    names.add("Adele");
    names.add("Maria");
    names.add("Patrick");
    names.add("Charles");
    names.add("Mark");

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Please enter a name you are wishint to search for.");
        String searchName = scanner.nextLine();
        boolean flag = false;

        for(int i = 0; i < names.size(); i++){
            
                if(names.get(i).toLowerCase().equals(searchName.toLowerCase())){
                    System.out.println(searchName+" is found in the list at index "+i);
                    flag = true;
                    break;
                }         
                            
            }
            if(flag == false){
                    System.out.println(searchName+" cannot be found in this list.");
            }
        }
        
    }
    
}
