package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadAFile {
    public static final char[] bufferedReader = null;
    public void readingFile(String inputPath) throws IOException{
            //  try(
            //     //  FileInputStream file = new FileInputStream(filePath);
            //     //  InputStreamReader streamReader = new InputStreamReader(file);
            //      BufferedReader bufferedReader = new BufferedReader(streamReader);
            //      LineNumberReader lineReader = new LineNumberReader(bufferedReader);
            // ){
            //     String outputLine = lineReader.readLine();
            //     while(outputLine != null){
            //         System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
            //         outputLine = lineReader.readLine();
            //     }
            try {
                FileReader reader = new FileReader(inputPath);
                LineNumberReader lineReader = new LineNumberReader(reader);

                int i;
                String outputLine = lineReader.readLine();
                
                        while(outputLine != null){
                            
                    System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
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
