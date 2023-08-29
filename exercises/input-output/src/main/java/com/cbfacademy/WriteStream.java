package com.cbfacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStream {
    public void writeStream() throws IOException{
        String filePath = "src/main/resources/exercise.txt";
        // input filepath
        String outputPath = "src/main/resources/writingExercise.txt";  
        // output filepath
        try { 
            File inputFile = new File(filePath);
            File outputFile = new File(outputPath);

            FileInputStream readingFile = new FileInputStream(inputFile);
            FileOutputStream writingFile = new FileOutputStream(outputFile); 

            int i;

            while((i = readingFile.read()) != -1){
                writingFile.write(i);
            }
            readingFile.close();
            writingFile.close();
            
        } catch (Exception e) {
        }finally{
            System.out.println("Process complete");
        }
    };
    
}
