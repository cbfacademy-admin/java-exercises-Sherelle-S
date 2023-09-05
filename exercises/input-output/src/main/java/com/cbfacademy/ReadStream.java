package com.cbfacademy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReadStream {
    
    // public static void main(String[] args) throws IOException{

        public void readStream (String inputPath) throws IOException{

            // declaring method witht the string perameter of inputPath, it throws an input output exception if neccessary
            try (
                // opens a try with rescources catch block, it autocloses no matter the outcome of the method
                Stream<String> lines = Files.lines(Path.of(inputPath))){               
                // declares a stream method as variabled lines. it then uses lines to get the path to input file
                
                lines.forEach(System.out::println);
                // reads each line of the input file and prints to console
                 
            }catch (FileNotFoundException e){
                // catches with a not found exception 
                e.printStackTrace();
                // shows location and line that exception is thrown
                System.out.println("This file cannot be located");
                // message to be delivered if exception is triggered
            }catch(IOException e){
                // catches an I/O exception 
                e.printStackTrace();
                // prints details of where the exception took place.
            }
                        
        }
       
}
