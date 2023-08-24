package com.cbfacademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // Read the file
        String filePath = "src/main/resources/exercise.txt";
        String outputPath = "src/main/resources/writingExercise.txt";

        
        try {
            // opens try catch block which can run now thing swill throw error
            ReadAFile readAFile = new ReadAFile();
            // new readAFile instance
            readAFile.readingFile(filePath);
            // running readingFile method on readAFile instance passing the filePath into it.
            WritingFile writeFile = new WritingFile();
            // new writeFile class
            writeFile.readAndWriteFile(filePath);
           
            // new instan
        } catch (IOException e) {
            // throws an IOexception
            e.printStackTrace();
            // prints a trace if exception is triggered
            System.out.println("Error in Reading");
            // error message
        }     
    // }close try-catch block
      ReadInvertedFile invertFile = new ReadInvertedFile();

    
        try {
            Stream<String> invertedStream = invertFile.readFileInList(filePath).stream().collect(ReadInvertedFile.reverseStream());

            // Use try-with-resources to handle the file writing
            try (PrintWriter writer = new PrintWriter(outputPath)) {
                invertedStream.forEach(writer::println);
            }

            System.out.println("Content inverted and written to 'inverted.txt' successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred while processing the file.");
        }
    }
    // closes main method
}
// closes app class

    

