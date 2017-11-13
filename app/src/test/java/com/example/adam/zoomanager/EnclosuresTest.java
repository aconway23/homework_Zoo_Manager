package com.example.adam.zoomanager;

import com.example.adam.zoomanager.Animals.Animals;
import com.example.adam.zoomanager.Animals.Penguins;
import com.example.adam.zoomanager.Animals.Weasels;
import com.example.adam.zoomanager.Enclosures.Enclosures;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by adam on 12/11/2017.
 */

public class EnclosuresTest {

    Enclosures<Penguins> penguinsEnclosures;
    Enclosures<Weasels> weaselsEnclosures;
    Animals penguins1;
    Animals penguins2;
    Animals weasels1;
    Animals weasels2;
    Animals weasels3;


    @Before
    public void before() {
        penguinsEnclosures = new Enclosures<>();
        weaselsEnclosures = new Enclosures<>();
        penguins1 = new Penguins("Pingu", 150, 4, "Adelie Penguin");
        penguins2 = new Penguins("Genghis", 500, 2, "Emperor Penguin");
        weasels1 = new Weasels("Stanley", 20, 9, "Stoat");
        weasels2 = new Weasels("Frank", 25, 7, "Ferret");
        weasels3 = new Weasels("Wesley", 30, 5, "Weasel");
    }



    @Test
    public void canTestAnimalName() {

        String name = name.getName();
        assertEquals


    }


}
