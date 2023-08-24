package com.cbfacademy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Checking {
    public static void main(String[] args) throws IOException{
        String filePath = "src/main/resources/exercise.txt";
        // input filepath
        String outputPath = "src/main/resources/writingExercise.txt";
                FileOutputStream fileOutput = new FileOutputStream(outputPath);    


        Stream<String> lines = Files.lines(Path.of(filePath));             
                // declares a stream method as variabled lines. it then uses lines to get the path to input file
                
            fileOutput.write(lines.forEach(System.out::println));
                // reads each line of the input file 
    }
    
}
