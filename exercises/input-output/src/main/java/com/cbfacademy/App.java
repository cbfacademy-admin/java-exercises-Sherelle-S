package com.cbfacademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        // System.out.println("Hello World!");
        // Read the file
        String filePath = "src/main/resources/exercise.txt";
        String outputPath = "src/main/resources/inverted1.txt";

        
        // try {
        //     // opens try catch block which can run now thing swill throw error
        //     ReadAFile readAFile = new ReadAFile();
        //     // new readAFile instance
        //     readAFile.readingFile(filePath);
        //     // running readingFile method on readAFile instance passing the filePath into it.
        //     WritingFile writeFile = new WritingFile();
        //     // new writeFile class
        //     writeFile.readAndWriteFile(filePath);
           
        //     // new instan
        // } catch (IOException e) {
        //     // throws an IOexception
        //     e.printStackTrace();
        //     // prints a trace if exception is triggered
        //     System.out.println("Error in Reading");
        //     // error message
        // }     
    // }close try-catch block
      ReadInvertedFile invertFile = new ReadInvertedFile();

      invertFile.ReadInvertedFile(filePath, outputPath);

    
        // try {
        //     Stream<String> invertedStream = invertFile.readFileInList(filePath).stream().collect(ReadInvertedFile.reverseStream());

        //     // Use try-with-resources to handle the file writing
        //     try (PrintWriter writer = new PrintWriter(outputPath)) {
        //         invertedStream.forEach(writer::println);
        //     }

        //     System.out.println("Content inverted and written to 'inverted.txt' successfully.");
        // } catch (Exception e) {
        //     e.printStackTrace();
        //     System.out.println("Error occurred while processing the file.");
        // }

        // // will be refactoring code to look more like this i think
        //  ReadInvertedFile invertFile = new ReadInvertedFile();
      

        // // Use try-with-resources to handle the file writing
        //     try{
        //          Stream<String> invertedStream = invertFile.readFileInList(filePath).stream().collect(ReadInvertedFile.reverseStream());
        //         try (PrintWriter writer = new PrintWriter(outputPath)) {
        //         invertedStream.forEach(writer::println);
        //     }
    }
    // closes main method
}
// closes app class

    

