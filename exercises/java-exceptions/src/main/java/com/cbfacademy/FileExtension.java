package com.cbfacademy;
// import com.codingblackfemales.academy.exception.App;

com.codingblackfemales.academy.exception.InvalidExtensionException;

// reates a method called check that checks the extension of the extensionNamesay and returns the appropraite answer.

public class FileExtension {
    

    public int check(){
        
        if( extensionNames == "null" || extensionNames.isEmpty()){
                throw new InvalidExtensionException("Illegal extension name");
            }

        if(extensionNames.endsWith(".java")){
                return 1;
            }else{
                return 0;
            }
        
    }
   
    // public int check(){
    //     for(int i = 0; i < extensionNames.length(); i++){
    //         if(extensionNames.contains("null") || extensionNames.isEmpty()){
    //             throw new InvalidExtensionException("Illegal extension name");
    //         }else if(extensionNames.contains(".java")){
    //             return 1;
    //         }else{
    //             return 0;
    //         }
    //     }
    // }
    
}
