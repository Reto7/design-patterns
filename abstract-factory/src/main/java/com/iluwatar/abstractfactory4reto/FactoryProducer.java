package com.iluwatar.abstractfactory4reto;

/**
 * Created by rk on 04.10.17.
 */
public class FactoryProducer  {

    //  parameter "elf" oder "orc"
    public static KingdomFactory produceFactory(String kingdom) {
        KingdomFactory kingdomFactory;
        if (kingdom.equals("elf")) {
            kingdomFactory = new ElfKingdomFactory();
        } else {
            kingdomFactory = new OrcKingdomFactory();
        }
        return kingdomFactory;
    }
}
