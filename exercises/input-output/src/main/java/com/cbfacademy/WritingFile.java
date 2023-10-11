package com.cbfacademy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class WritingFile {
//    opens writingFile class

    public void readAndWriteFile(String inputPath) throws IOException{
        // opens readAndWriteFile method and passes the string containing the url to be passed into it, throwing and exceptions if not found.
        // you cant try catch without throwing first.
           
            try {
                // open try catch block
                String outputPath = "src/main/resources/writingExercise.txt";
                // assings string vriable outputpath to the url file is to be written to.
                FileReader reader = new FileReader(inputPath);
                // opens new fileReader and passes input path of file to be read
                LineNumberReader lineReader = new LineNumberReader(reader);
                // opens new linereader passing the file reader into it.

                FileWriter writer = new FileWriter(outputPath);
                // new instance of filewriter passing the output path into it.

                String outputLine = lineReader.readLine();
                // assisngs outputLine to the readLine method in linereader
                
                        while(outputLine != null){
                            // while output line is not empty
                    String formattedText = String.format("%d: %s%n", lineReader.getLineNumber(), outputLine);
                //    assigns formatted text to this string variable
                    writer.write(formattedText);
                    // writes formatted writer to the formattedText file

                    System.out.print(formattedText);
                    // prints text to console. print is chosen rather than println as println adds another line to each line of text
                    
                   outputLine = lineReader.readLine();
                //    stops and infinit loop of text line 1. allowing text to move onto next line
                }
                // closes while loop
               
                reader.close();
                // close reader
                writer.close();
                // close writer
            } catch (FileNotFoundException e) {
                // creates filenot founf=d exception
                System.out.println("File not found, please check file path");
                // file not found message to be displayed
            }catch(IOException e){
                // io exception
                e.printStackTrace();
                // prints trace of io exception
            }
            // closes try catch block      
        }
        // close method
}
// close class
