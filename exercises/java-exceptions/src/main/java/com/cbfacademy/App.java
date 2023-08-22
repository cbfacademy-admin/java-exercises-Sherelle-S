package com.cbfacademy;

import java.lang.reflect.Array;
// import com.codingblackfemales.academy.exception.FileExtension;
// import com.codingblackfemales.academy.exception.CustomException;
// import com.codingblackfemales.academy.exception.ThrowsException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){  
//         // - it takes a list of file names
//         // - checks each file's extension and maps the returned value to the filename
//         // - maps `-1` when an exception occurs

        // String extensionNames[]
        //         = new String[] {"App.java", "App.txt", null, "App.md"};
            List<String> extensionNames = Arrays.asList("App.java", "App.txt", null, "App.md");
                // for(int i = 0; i < extensionNames.length;i++){
                //     System.out.println(extensionNames[i]);
                // }
//             // Getting the list view of Array
            // List<String> list = Arrays.asList(extensionNames);
           Map<String, Integer> fileExtensionCount = new HashMap<String, Integer>();
           for( String ext : extensionNames){
            Integer i = fileExtensionCount.get(ext);
            if(i == null){
                i = 0;
            }
            fileExtensionCount.put(ext, i + 1);

           }

           System.out.println(fileExtensionCount);

           

        
//         try{
//              FileExtension fileExtension = new FileExtension1();
//             fileExtension.check(//remember this checks a string);
//              ); methodName();
//         }
//         catch(exceptionName e){
//             System.out.println("Caught in main");
//         }
//         // Array.asList("App.java", "App.txt", null, "App.md");
    }
}
