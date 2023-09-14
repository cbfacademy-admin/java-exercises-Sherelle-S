package com.cbfacademy;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Read the file
        String filePath = "src/main/resources/exercise.txt";
        // String outputPath = "src/main/resources/writingExercise.txt";

        
        try {
            ReadAFile readAFile = new ReadAFile();
            readAFile.readingFile(filePath);
            WritingFile writeFile = new WritingFile();
            writeFile.readAndWriteFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in Reading");
        }     
    }
}

    

