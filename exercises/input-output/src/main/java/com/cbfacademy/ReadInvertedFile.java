package com.cbfacademy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ReadInvertedFile {
    // // create a programme to invert the exercise.txt file
    public void TextInverter (String fileName, String inverterdPath) throws IOException{
        // creating a method that passes in the input and output path of files to written and read drom main. throws IO Exception if unable to complete
        try {
            // openein try catch block
            List <String> textLine =  Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            /* File - static method that allows file to be manipulated in this case it grants access to:
            * reads all lines in the file 
            * which we get from the path stored in the variable filename.
            *standardCharset in eight-bit UCS transformation format. (extends ASCII character set to use 8-bit code points)
            */ 
        Collections.reverse(textLine);
            // uses collections to reverse the textLines String
        List<String> reversedLines = textLine.stream().collect(Collectors.toList());
            // Creates a new string called reversedLines where textLines are turned into a stream and the terminal process of collect is used. the collectors are turned into a list
       Files.write(Paths.get(inverterdPath), reversedLines);
    //    using files to gather all associated files, and write them to the inverterdPath parameter. reversedLines list is what is being written.
        System.out.println(reversedLines);
        // checking that reversed lines actually revesed the lines of the file
        } catch (FileNotFoundException e){
            // file not found exception
            e.printStackTrace();
            // prints the location exception occures
        }catch(FileAlreadyExistsException e){
            // file already exists exception
            System.out.println(inverterdPath + " name already exists, please select another name");
            // asks user for new output path name
        } catch (IOException e) {
            // catches io exception
            System.err.println("File not found, please check file path");
            // file not found
            e.printStackTrace();
            // prints location exception occurs 
        }catch(Exception e) {
            // catches all other exceptions
            e.printStackTrace();
            // prints location exception occurs
        }
        // closes try catch block
    }
    // closes method

}
// closes class