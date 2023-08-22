package com.cbfacademy;

public class InvalidExtensionException extends Exception {

    // public InvalidExtensionException(String errorMessage){
    //     super(errorMessage);
    // }
    private final String message;

    public InvalidExtensionException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return String.join(" - ", super.getMessage(), this.message);
    // handles when file name is null
    }    

}

