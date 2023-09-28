package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        EarthAfrica earthAfrica = new EarthAfrica();
        earthAfrica.earthAfrica();

        
        
    }
}