/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.factory.method.reto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The Factory Method is a creational design pattern which uses factory methods to deal with the
 * problem of creating objects without specifying the exact class of object that will be created.
 * This is done by creating objects via calling a factory method either specified in an interface
 * and implemented by child classes, or implemented in a base class and optionally overridden by
 * derived classes—rather than by calling a constructor.
 * <p>
 * In this Factory Method example we have an interface ({@link Blacksmith}) with a method for
 * creating objects ({@link Blacksmith#manufactureWeapon}). The concrete subclasses (
 * {@link OrcBlacksmith}, {@link ElfBlacksmith}) then override the method to produce objects of
 * their liking.
 * 
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);


  /**
   *
   * @ERLEDIGT:
   * - entferne diese konkreten Klassen und nutze stattdessen das interface ({@link Blacksmith})
   * =>  private final Blacksmith blacksmith;
   */


  //private OrcBlacksmith orcBlacksmith;
  //private ElfBlacksmith elfBlacksmith;

  private final Blacksmith blacksmith;  // TODO weshalb final??

  /**
   * Creates an instance of <code>App</code> which will use <code>blacksmith</code> to manufacture 
   * the weapons for war.
   * <code>App</code> is unaware which concrete implementation of {@link Blacksmith} it is using.
   * The decision of which blacksmith implementation to use may depend on configuration, or
   * the type of rival in war.
   */
  public App(Blacksmith blacksmith) {
    this.blacksmith = blacksmith;
  }

  //public App(OrcBlacksmith orcBlacksmith) {
  //  this.orcBlacksmith = orcBlacksmith;
  //}

  //public App(ElfBlacksmith elfBlacksmith) {
  //  this.elfBlacksmith = elfBlacksmith;
  //}


  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    // Lets go to war with Orc weapons
    App app1 = new App(new OrcBlacksmith());
    //app.manufactureWeapons("Orc");
    app1.manufactureWeapons();
    
    // Lets go to war with Elf weapons
    App app2 = new App(new ElfBlacksmith());
    app2.manufactureWeapons();
  }

  /**
   *
   * @ERLEDIGT: schreibe die Methode um
   *
   * - Entferne parameter
   * - Nutze die Methode ({@link Blacksmith#manufactureWeapon}) welche im Interface ({@link Blacksmith}) definiert ist
   *   um ({@link Weapon}) Objekte zu erzeugen anstatt hier die Klassen mit 'new' zu instanziieren
   *
   */
//  private void manufactureWeapons(String weaponKind) {
//    Weapon weapon;
//
//    if(weaponKind == "Orc") {
//      weapon = new OrcWeapon(WeaponType.SPEAR);
//      LOGGER.info(weapon.toString());
//      weapon = new OrcWeapon(WeaponType.AXE);
//      LOGGER.info(weapon.toString());
//    } else if(weaponKind == "Elf") {
//      weapon = new ElfWeapon(WeaponType.SPEAR);
//      LOGGER.info(weapon.toString());
//      weapon = new ElfWeapon(WeaponType.AXE);
//      LOGGER.info(weapon.toString());
//    }
//  }
  // DIE IDEE DAHINTER: DIE "APP" MUSS KEINE KENTNISSE MEHR HABEN VON: ElfWeapon und OrcWeapon
  private void manufactureWeapons(){
    Weapon weapon1 = this.blacksmith.manufactureWeapon(WeaponType.SPEAR);
    LOGGER.info(weapon1.toString());
    Weapon weapon2 = this.blacksmith.manufactureWeapon(WeaponType.AXE);
    LOGGER.info(weapon2.toString());

  }

//BEISPIEL AUS DEM FACTORYMETHODTEST:
//  Blacksmith blacksmith = new OrcBlacksmith();   <=== HIER WIRD EIN KONKRETER HUFSCHMIED GEWAEHLT
//  Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
//  verifyWeapon(weapon, WeaponType.SPEAR, OrcWeapon.class);


//  private void manufactureOrcWeapons() {
//    Weapon weapon;
//  }
}
