package com.parameterisierte.factory.methode.reto;

/**
 * Created by rk on 28.09.17.
 */
public class LP extends Vinyl {
    public LP(String color, String name, String artist) {
        this.name = name;
        this.color = color;
        this.artist = artist;
        System.out.println("ich bin eine LP");
        System.out.println("Artist: " + this.artist);
    }
}
