package com.iluwatar.adapter4reto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Es handelt sich bei dieser Klasse um ein echtes Kriegsschiff vom Typ {@link BattleShip}
 *
 */
public class RealBattleShip implements BattleShip {

  private static final Logger LOGGER = LoggerFactory.getLogger(RealBattleShip.class);

  @Override
  public void fire() {
    LOGGER.info("fire!");
  }

  @Override
  public void move() {
    LOGGER.info("The Boat is moving to that place");
  }
}
