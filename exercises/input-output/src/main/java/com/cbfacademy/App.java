package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Read the file
        String filePath = "src/main/resources/exercise.txt";
        // WriteFile writeFile = new WriteFile();

        // // filePath.writeFile();
        // InvertedFile invertedFile = new InvertedFile();

        // // String data = readFileAsString("src/main/resources/exercise.txt");
        // String data = invertedFile.readFileAsString(filePath);

        // System.out.println(data);
        ReadInvertedFile invertFile = new ReadInvertedFile();

        // List huh = invertFile.readFileInList(filePath);

        // Iterator<String> itr = huh.iterator();
        // while(itr.hasNext())
        // System.out.println(itr.next());

       Stream<String> stream = invertFile.readFileInList(filePath).parallelStream();

        stream.collect(ReadInvertedFile.reverseStream()).forEach(System.out::println);

       Path fileName = Path.of("src/main/resources/exercise3.txt");

       Files.writeString(fileName, stream.collect(ReadInvertedFile.reverseStream()).forEach(System.out::println));

       
           
       
    }

}

    

// put a buffered reader arounf the stream reader to get access to the
