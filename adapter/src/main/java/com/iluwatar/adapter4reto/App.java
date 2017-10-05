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
package com.iluwatar.adapter4reto;

/**
 * An adapter helps two incompatible interfaces to work together. This is the real world definition
 * for an adapter. Interfaces may be incompatible but the inner functionality should suit the need.
 * The Adapter design pattern allows otherwise incompatible classes to work together by converting
 * the interface of one class into an interface expected by the clients.
 *
 * <p>
 * There are two variations of the Adapter pattern: The class adapter implements the adaptee's
 * interface whereas the object adapter uses composition to contain the adaptee in the adapter
 * object.
 *
 * The story of this implementation is this: <br>
 * Pirates are coming! Our captain of the  {@link RealBattleShip} needs help. There are two captains of {@link FishingBoat}s close to with their boats.
 * We need their help but have no time to make up two new {@link BattleShip}s! we need to reuse their {@link FishingBoat}s. The two fisherboat
 * captains need a battleship which can fire and move. The spec is in {@link BattleShip}. We will
 * use the Adapter pattern to reuse the {@link FishingBoat}s.
 *
 */
public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {

    Captain captainOfBattleShip = new Captain((new RealBattleShip()));
    captainOfBattleShip.move();
    captainOfBattleShip.fire();

    /**
     * @ERL.: aktiviere sobald {@link BattleFishingBoat} umgesetzt
     * objektbasierten Adapter
     */
    Captain captainOfFirstFisherBoat = new Captain(new BattleFishingBoat());
    captainOfFirstFisherBoat.move();
    captainOfFirstFisherBoat.fire();

    /**
     * @ERL: aktiviere sobald {@link RealBattleFishingBoat} umgesetzt
     * klassenbasierten Adapter
     */
    Captain captainOfSecondFisherBoat = new Captain(new RealBattleFishingBoat());
    captainOfSecondFisherBoat.move();
    captainOfSecondFisherBoat.fire();

  }
}
