package com.cbfacademy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WritingFile {

     public void writingFile(){
            String fileName = "exercise2.txt";

        try(
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            PrintWriter writer = new PrintWriter(outputStreamWriter);
        ){
            writer.print(ReadAFile.bufferedReader);//get access to this buffered reader currently outside of your scope.
            writer.close();
            outputStreamWriter.close();
        }catch (IOException e){
            System.out.println("File writing exception: " + e.getMessage());
        }
    }
    
    
}
