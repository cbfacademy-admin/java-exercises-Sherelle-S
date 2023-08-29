package com.cbfacademy;

import java.io.IOException;

public class NioMain {
    public static void main(String[] args) {
        try{
            String filePath = "src/main/resources/exercise.txt";
            // input filepath
            String outputPath = "src/main/resources/writingExercise.txt";  
            // output filepath
            String inverterdPath = "src/main/resources/inverted.txt"; 
            
            ReadStream readStream = new ReadStream();
            // new instance of readstream file
            readStream.readStream(filePath);
            // invokes the readStream method passing filepath in as the requested perameter.

            WriteStream writeStream = new WriteStream();
            writeStream.writeStream();

            ReadInvertedFile invertFile = new ReadInvertedFile();
            invertFile.TextInverter(filePath, inverterdPath);
            System.out.println("Content inverted and written to "+inverterdPath+" successfully.");

        }catch(IOException e){
            // catching input output exceptions
            e.printStackTrace();
            // throwable class that prints the line numbers and class name where the exception occured. 
            System.out.println("Failure to read file, please check inputpath is correct");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred while processing the file.");
        }
    }
    
}
 