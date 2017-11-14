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
package com.iluwatar.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The Strategy pattern (also known as the policy pattern) is a software design pattern that enables
 * an algorithm's behavior to be selected at runtime.
 *
 * In this example ({@link DragonSlayingStrategy}) encapsulates an algorithm. The containing object
 * ({@link DragonSlayer}) can alter its behavior by changing its strategy.
 * 
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  
  /**
   * Program entry point
   * 
   * @param args command line args
   *
   * @todo: nutze hier das Strategy Pattern, sodass die drei Strategien
   * {@link MeleeStrategy}, {@link ProjectileStrategy} und {@link SpellStrategy}
   * via Context {@link DragonSlayer}) verwendet werden können
   */
  public static void main(String[] args) {
    LOGGER.info("Green dragon spotted ahead!");
    MeleeStrategy meleeStrategy = new MeleeStrategy();
    meleeStrategy.execute();

    LOGGER.info("Red dragon emerges.");
    ProjectileStrategy projectileStrategy = new ProjectileStrategy();
    projectileStrategy.execute();

    LOGGER.info("Black dragon lands before you.");
    SpellStrategy spellStrategy = new SpellStrategy();
    spellStrategy.execute();
  }
}
