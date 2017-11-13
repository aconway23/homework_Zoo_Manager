package com.example.adam.zoomanager;

import com.example.adam.zoomanager.Enclosures.Enclosures;

import java.util.ArrayList;

/**
 * Created by adam on 12/11/2017.
 */

public class Zoo<V extends Enclosures> {

    private ArrayList<V> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList<>();
    }


}
