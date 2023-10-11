package com.cbfacademy.people;

public class ImmutablePerson {

    private String firstName;
    private String lastName;

        public ImmutablePerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }    

    public String toString(){
        return firstName+ " "+ lastName;
    }
}
