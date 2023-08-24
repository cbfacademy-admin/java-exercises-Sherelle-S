package com.cbfacademy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadAFile {
    // public static final char[] bufferedReader = null;
    public void readingFile(String inputPath) throws IOException{
        // sets up the method and passes the input filepath directly into it with the ability to throw and exception.

            try {
                // open try-catch block
                FileReader reader = new FileReader(inputPath);
                // creating new instance of fileReader
                LineNumberReader lineReader = new LineNumberReader(reader);
                // new instance of line number whic counts the lines of a file being read

                String outputLine = lineReader.readLine();
                // creates a variable 'outputLine' and assigns lineReader.readLine() to it.

                
                        while(outputLine != null){
                            // checks if there is and output line. while output line is not null
                    System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
                    // print this formatted string.
                    outputLine = lineReader.readLine();
                    // This line stops the infinte loop of line one.
                }
                // closes the while loop
               
                reader.close();
                // close reader to avoide memory leaks
            } catch (FileNotFoundException e) {
                // catches the file not found
                // TODO: handle exception
                System.out.println("File not found, please check file path");
                // message printed if caught error is triggered.
            }catch(IOException e){
                // catches all other caught errors
                e.printStackTrace();
                // prints out where the error has taken place
            }
            // closes try-catch block
           
        }
        // closes the method
}
// closes the class
