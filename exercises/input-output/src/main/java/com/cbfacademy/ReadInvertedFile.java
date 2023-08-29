package com.cbfacademy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadInvertedFile {
    // // create a programme to invert the exercise.txt file
    public void ReadInvertedFile (String fileName, String outputPath) throws IOException{
        List <String> textLine =  Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        Collections.reverse(textLine);

        List<String> reversedLines = textLine.stream().collect(Collectors.toList());

       Files.write(Paths.get(outputPath), reversedLines);
        System.out.println(reversedLines);
    }
    // return textLine;
//    public List<String> readFileInList(String fileName){
//     // creates a list of strings called readFileList passing in fileName which is the input string.
//         try{
//             // opens trycatch block
//             return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
//             /* File - static method that allows file to be manipulated in this case it grants access to:
//             * reads all lines in the file 
//             * which we get from the path stored in the variable filename.
//             *standardCharset in eight-bit UCS transformation format. (extends ASCII character set to use 8-bit code points)
//             */ 

//         }catch(IOException e){
//             System.out.println("Fatal error");
//             return Collections.emptyList();
//         }
//         // DELELE return lines;
//     }
//     // for loop with control flows look into the reverse method that collections have
//     public static  <T> Collector<T, ?, Stream<T> > reverseStream(){
//         return Collectors.collectingAndThen(Collectors.toList(), list -> {
//             Collections.reverse(list);
//             return list.stream();
//         });
//     // } 
}
