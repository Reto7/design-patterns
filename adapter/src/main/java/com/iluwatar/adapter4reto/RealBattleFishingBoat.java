
package com.iluwatar.adapter4reto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ERL.: implementiere einen klassenbasierten Adapter für ein {@link FishingBoat}
 * Naming vorher: RealBattleFishingBoat
 */
public class RealBattleFishingBoat extends FishingBoat implements BattleShip {

  private static final Logger LOGGER = LoggerFactory.getLogger(RealBattleFishingBoat.class);

  @Override
  public void fire() {

  }

  @Override
  public void move() {
    this.sail();  // wir sind ja durch das EXTENDS auch ein Fischerboot!
  }
}
