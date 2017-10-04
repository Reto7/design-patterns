package com.parameterisierte.factory.methode.reto;

/**
 * Created by rk on 01.10.17.
 */
public class App {

    public static void main(String[] args) {
        VinylCreator vinylCreator = new VinylCreator();
        vinylCreator.create("LP", "schwarz", "Hells Bells", "AC/DC");
    }
}
