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

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Read the file
        String filePath = "src/main/resources/exercise.txt";
        WriteFile writeFile = new WriteFile();

        filePath.writeFile();
        
        
           
       
    }
}

    

// put a buffered reader arounf the stream reader to get access to the
