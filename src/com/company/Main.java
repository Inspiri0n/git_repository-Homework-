package com.company;

public class Main {

    public static void main(String[] args) {
	Person alex = new Person();
    Person valera = new Person();
    alex.height = 190;
    System.out.println(alex.height);
    System.out.println(valera.height);
    alex.say("Alex");
    }
}

