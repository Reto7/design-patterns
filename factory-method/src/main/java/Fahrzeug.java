import java.awt.*;

public class Fahrzeug {

  /**
   * Factory-Methoden sind solche, die die Erzeugung von Objekten kapseln.
   * Im Beispiel werden zwei Factory-Methoden deklariert, die jeweils überladen sind.
   * So wird beim Aufruf bereits deutlich, ob es sich beim neu gebildeten Objekt um
   * ein PKW- oder ein LKW-Objekt handelt. Alle Methoden sind statisch deklariert und
   * greifen auf lediglich einen privaten Konstruktor zu, der somit nicht mehr von außen
   * aufgerufen werden kann. Die Konfiguration der jeweiligen Fahrzeug-Objekte wird
   * innerhalb der Factory-Methoden durch Belegung der Parameter durchgeführt.
   
   
    https://www.philipphauer.de/study/se/design-pattern/factory-method.php

    Vorteile dieses Entwurfs:
    >	Kohäsionsgewinn durch Trennung der Objekterstellung von der Objektverarbeitung.
    >	Wiederverwendbarkeit der Factory.
    >	Zentrale Stelle für Wartung und Erweiterung.

   */

  // kann von extern nicht mehr aufgerufen werden
  private Fahrzeug(String type, Color color, int achsen,
      Rectangle ladeFlaeche, Kran ladeKran, Dach dach) {
    // ...
  }



  // FACTORY METHODE 1 (ueberladen, ruft den mit 2 Parametern auf)
  public static Fahrzeug createPKW(Color color) {
    return createPKW(color, null);
  }
  // FACTORY METHODE 1 (ueberladen) --> macht die Instanzierung
  public static Fahrzeug createPKW(Color color, Dach dach) {
    return new Fahrzeug("PKW", color, 2, null, null, dach);
  }



  // FACTORY METHODE 2 (ueberladen, ruft den mit 2 Parametern auf)
  public static Fahrzeug createLKW(Color color, int achsen) {
    return createLKW(color, achsen, null);
  }
  // FACTORY METHODE 2 (ueberladen, ruft den mit 3 Parametern auf)
  public static Fahrzeug createLKW(Color color, int achsen,
      Rectangle ladeFlaeche) {
    return createLKW(color, achsen, ladeFlaeche, null, null);
  }
  // FACTORY METHODE 2 (ueberladen) --> macht die Instanzierung
  public static Fahrzeug createLKW(Color color, int achsen, Rectangle
      ladeFlaeche, Kran ladeKran, Dach dach) {
    return new Fahrzeug("LKW", color, achsen, ladeFlaeche, ladeKran, null);
  }




//  ALTE LOESUNG:
//  zig Konstruktoren mit zig ParameterNames
//  Die Klasse weist eine ganze Reihe verketteter Konstruktoren auf,
//  um unterschiedliche Fahrzeug-Konfigurationen zuzulassen.
//  Ein solches Design ist unvorteilhaft, da die Auswahl des jeweils
//  geeigneten Konstruktors unintuitiv ist und zu Fehlern führen kann.
//  Einige Parameter kommen entweder nur für den Typ LKW (ladeflaeche, achsen, ladekran)
//  oder nur für PKW (dach) in Frage. Durch die Verkettung der Konstruktoren muss somit
//  ggf. null übergeben werden, was die Lesbarkeit des Codes verunklärt und fehlerträchtig ist.
//  Wünschenswert wäre eine möglichst eindeutige Schnittstelle, die entweder PKW oder LKW erzeugt.
//
//  public Fahrzeug(String type, Color color) {
//    this(type, color, 2);
//  }
//
//  public Fahrzeug(String type, Color color, Dach dach) {
//    this(type, color, 2, null, null, dach);
//  }
//
//  public Fahrzeug(String type, Color color, int achsen) {
//    this(type, color, achsen, null);
//  }
//
//  public Fahrzeug(String type, Color color, int achsen,
//      Rectangle ladeflaeche) {
//    this(type, color, achsen, ladeflaeche, null, null);
//  }
//
//  public Fahrzeug(String type, Color color, int achsen, Rectangle ladeflaeche,
//      Kran ladeKran, Dach dach) {
//    System.out.println("Fahrzeug vom Typ " + type + " erzeugt");
//  }



  // inner class, dient nur zu testzwecken
  private class Kran {
  }
  private class Dach {
  }

}
