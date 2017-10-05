
package com.iluwatar.adapter4reto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ERL.: implementiere einen klassenbasierten Adapter für ein {@link FishingBoat}
 * Naming vorher: BattleFishingBoat2
 */
public class BattleFishingBoat2 extends FishingBoat implements BattleShip {

  private static final Logger LOGGER = LoggerFactory.getLogger(BattleFishingBoat2.class);

  @Override
  public void fire() {

  }

  @Override
  public void move() {
    this.sail();  // wir sind ja durch das EXTENDS auch ein Fischerboot!
  }
}
