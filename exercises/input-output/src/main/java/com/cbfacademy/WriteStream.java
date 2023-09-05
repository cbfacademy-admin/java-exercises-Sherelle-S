package com.cbfacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class WriteStream {
    public void writeStream() throws IOException{
        Scanner scanner = new Scanner(System.in);
        // input filepath
        System.out.println("Please enter the file path you wish to read from.");
        String filePath = scanner.nextLine();
        // output filepath
        System.out.println("Please enter the file path you wish to save this file to.");
        String outputPath = scanner.nextLine();  
        
        try { 

            if(outputPath == null){
                 outputPath = "src/main/resources/writingExercise.txt";
            }
            
            File inputFile = new File(filePath);
            File outputFile = new File(outputPath);

            FileInputStream readingFile = new FileInputStream(inputFile);
            FileOutputStream writingFile = new FileOutputStream(outputFile); 

            int i;

            while((i = readingFile.read()) != -1){
                writingFile.write(i);
            }
            scanner.close();
            readingFile.close();
            writingFile.close();
            
        // } catch (FileNotFoundException | FileAlreadyExistsException) {
            System.out.println("Unable to find filepath. Please check your input and output filepaths.");
            e.printStackTrace();
        }finally{
            System.out.println("Process complete");
        }
    };
    
}
