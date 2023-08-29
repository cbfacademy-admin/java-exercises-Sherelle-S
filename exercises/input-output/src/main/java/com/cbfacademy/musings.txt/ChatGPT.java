package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChatGPT {
    public static void main(String[] args) {
        Path inputFile = Paths.get("src/main/resources/exercise.txt");
        Path outputFile = Paths.get("src/main/resources/inverted.txt");

        try {
            List<String> lines = Files.readAllLines(inputFile);
            Collections.reverse(lines); // Reverse the order of lines

            List<String> invertedLines = lines.stream()
                    .collect(Collectors.toList());

            Files.write(outputFile, invertedLines);
            System.out.println("Content inverted and written to 'inverted.txt' successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
