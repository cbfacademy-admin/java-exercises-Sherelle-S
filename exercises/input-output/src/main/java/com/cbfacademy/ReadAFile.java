package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadAFile {
    // public static final char[] bufferedReader = null;
    public void readingFile(String inputPath) throws IOException{
        // sets up the functions and passes the input filepath directly into it with the ability to throw and exception.

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
                }
               
                reader.close();
            } catch (FileNotFoundException e) {
                // TODO: handle exception
                System.out.println("File not found, please check file path");
            }catch(IOException e){
                e.printStackTrace();
            }
            
           
        }
}
