package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadFile {
    public static final char[] bufferedReader = null;
    String filePath = "src/main/resources/exercise.txt";
    public void readFile(){
             try(
                 FileInputStream file = new FileInputStream(filePath);
                 InputStreamReader streamReader = new InputStreamReader(file);
                 BufferedReader bufferedReader = new BufferedReader(streamReader);
                 LineNumberReader lineReader = new LineNumberReader(bufferedReader);
            ){
                String outputLine = lineReader.readLine();
                while(outputLine != null){
                    System.out.printf("%d: %s%n", lineReader.getLineNumber(), outputLine);
                    outputLine = lineReader.readLine();
                }
               
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }      
        }
}
