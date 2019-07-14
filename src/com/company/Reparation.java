package com.company;

import java.util.Date;

public class Reparation implements ReparationInterface {

    String date;
    String name;
    String description;

    Integer cost;


    public Reparation(String date, String name, String description, Integer cost) {
        this.date = date;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public Reparation() {
    }

    public String show() {
        return date +" "+name+": "+description+" - "+cost+"zl";
    }


}
