package com.cbfacademy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadInvertedFile {
    // // create a programme to invert the exercise.txt file
    public List<String> readFileInList(String fileName){
        List<String> lines = Collections.emptyList();
        try{
            lines= Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }catch(IOException e){
            System.out.println("Fatal error");
        }
        return lines;
    }
    
    public static  <T> Collector<T, ?, Stream<T> > reverseStream(){
        return Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list.stream();
        });
    }

    public static void OutputStream(String data){
        OutputStream os = null;
        try{
            os = new FileOutputStream(new File("src/main/resources/exercise3.txt"));
            os.write(data.getBytes(), 0 data.length());
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Could not write to file");
        }
    }
}
