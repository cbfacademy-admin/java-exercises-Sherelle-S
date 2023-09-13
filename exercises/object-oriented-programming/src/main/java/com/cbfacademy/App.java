package com.cbfacademy;

import com.cbfacademy.people.ExtraPerson;
import com.cbfacademy.people.ImmutablePerson;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ImmutablePerson person = new ImmutablePerson("Jane","Richards");
        System.out.println(person);

        ExtraPerson missExtra = new ExtraPerson("Beyonce", "Giselle", "Knowles-Carter", "Queen-B");
        System.out.println(missExtra);

    }
}