package com.cbfacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // try{
        //     FileReader fileReader = new FileReader("/resources/exercise.txt");

        //     System.out.println("Reading char by char : \n");

        //     int i;

        //     while((i = FileReader.read()) i= -1){
        //         System.out.println((char)i);
        //     }
        // }
        String filePath = "src/main/resources/exercise.txt";
            try(
                 FileInputStream file = new FileInputStream(filePath);
                InputStreamReader streamReader = new InputStreamReader(file);
                LineNumberReader lineReader = new LineNumberReader(streamReader);
            ){
                String outputLine = lineReader.readLine();
                while(outputLine != null){
                    System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
                    outputLine = lineReader.readLine();
                }
            // }
               
            //     int data = reader.read();

            //     while(data != -1){
            //         System.out.print((char) data);
            //         data = reader.read();
            //     }
            //     reader.close();
            //     FileInputStream file = new FileInputStream(filePath);
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
        
    }
}
