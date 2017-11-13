package com.example.adam.zoomanager.Enclosures;

import com.example.adam.zoomanager.Animals.Animals;

import java.util.ArrayList;

/**
 * Created by adam on 12/11/2017.
 */

    public class Enclosures<T extends Animals> {
    private ArrayList<T> animals;



    public Enclosures() {
        this.animals = new ArrayList<>();
    }

    public Enclosures(ArrayList<T> enclosures) {
        this.animals = enclosures;
    }




//    public class Enclosures<T extends Animals> {
//        private ArrayList<T> animal;
//
//
//        public Enclosures() {
//            animal = new ArrayList<>();
//        }

}


