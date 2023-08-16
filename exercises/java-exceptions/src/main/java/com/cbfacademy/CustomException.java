package com.cbfacademy;

public class CustomException extends Exception {

    private final String message;

    public CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return String.join(" - ", super.getMessage(), this.message)
    }
    // handles when file name is null
    
}
