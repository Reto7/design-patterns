package com.samu.composite;

/**
 * Created by sandromuggli on 03.10.17.
 */
public class App {
    public static void main(String[] args) {
    /*
     * Bilde Firmenhierachie
     */
        //Vertrieb
        LineManager lm1 = new LineManager("W. Fischer", "Vertrieb");
        lm1.add(new AtomicEmployee("P. Meier"));
        lm1.add(new AtomicEmployee("I. Schulz"));
        //Technologie
        LineManager lm2 = new LineManager("T. Kunz", "Technologie");
        lm2.add(new AtomicEmployee("M. Rehberg"));
        lm2.add(new AtomicEmployee("O. Riedel"));
        //Entwicklung
        LineManager al3 = new LineManager("M. Hardbrot", "Entwicklung");
        al3.add(new AtomicEmployee("M. Rehberg"));
        al3.add(lm2);
        //Vorstand
        LineManager head = new LineManager("A. Müller", "Vorstand");
        head.add(lm1);
        head.add(new AtomicEmployee("U. Temann"));
        head.add(al3);

    /*
     * Firmenhierarchie ausdrucken
     */
        head.print("");
    }
}
