package com.example.adam.zoomanager;

import com.example.adam.zoomanager.Animals.Penguins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



/**
 * Created by adam on 12/11/2017.
 */

public class PenguinsTest {


    @Test
    public void testGetName() {
        Penguins penguins = new Penguins("Pingu", 150, 4, "Adelie Penguin");
        String name = penguins.getName();
        assertEquals("Pingu", name);

    }

}
