package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EarthAfrica {

    public void earthAfrica(){
        String websiteURl ="https://codingblackfemales.com/academy?c=t2t/";
        
        try {
            URL myURL = new URL(websiteURl);
            HttpURLConnection connection = (HttpURLConnection) myURL.openConnection();
            try{int responseCode = connection.getResponseCode();
            if(responseCode != 200){
            System.out.println("Unable to connect to server.");
            throw new IOException("Unexpected response from server.");
        }   else{
            try(BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String inputLine;
            while((inputLine = in.readLine()) != null){
                System.out.println(inputLine);
            }
        }
        }
        }finally{
            connection.disconnect();
        }
        }catch ( IOException e){
            System.out.println("An error occurred while trying to connect to server. please check your URL.");
        }
    }
    }
    
}
