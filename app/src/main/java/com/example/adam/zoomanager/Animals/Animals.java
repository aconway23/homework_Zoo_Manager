package com.example.adam.zoomanager.Animals;

/**
 * Created by adam on 12/11/2017.
 */

public abstract class Animals {

    private String name;
    private int value;
    private int age;
    private String species;

    public Animals(String name, int value, int age, String species) {

        this.name = name;
        this.value = value;
        this.age = age;
        this.species = species;


    }


    public String getName() {
        return name;
    }


}
