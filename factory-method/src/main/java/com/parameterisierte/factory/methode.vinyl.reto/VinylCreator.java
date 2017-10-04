package com.parameterisierte.factory.methode.reto;

/**
 * Created by rk on 28.09.17.
 */
public class VinylCreator {

    public Vinyl create(String type, String color, String name, String artist) {
        if (type.equals("EP")) {
            return new EP(color, name, artist);
        } else if (type.equals("LP")) {
            return new LP(color, name, artist);
        }
        return null;
    }

}
