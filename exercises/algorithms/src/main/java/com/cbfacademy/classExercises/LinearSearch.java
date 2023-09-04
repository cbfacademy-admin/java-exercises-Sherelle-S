package com.cbfacademy.classExercises;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10, 20,40,50,30};

        int searchEle = 12;
        boolean flag = false;

        for(int i = 0; i < a.length; i++){
            if(searchEle == a[i]){
                System.out.println("Element found ar: "+i);
                flag = true;
                break;
            }
        }
        if(flag == false){
             System.out.println("Element not found");
        }
       
    }
}
