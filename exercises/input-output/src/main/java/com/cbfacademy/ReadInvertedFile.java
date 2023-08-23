package com.cbfacademy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadInvertedFile {
    // // create a programme to invert the exercise.txt file
    public List<String> readFileInList(String fileName){
        //DELETE  List<String> lines = Collections.emptyList();
        try{
            // lines= 
            return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }catch(IOException e){
            System.out.println("Fatal error");
            return Collections.emptyList();
        }
        // DELELE return lines;
    }
    
    public static  <T> Collector<T, ?, Stream<T> > reverseStream(){
        return Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list.stream();
        });
    }
}
