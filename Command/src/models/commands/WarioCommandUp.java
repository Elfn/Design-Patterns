package models.commands;

import interfaces.Command;
import models.characters.MarioCharacter;

/**
 * Created by Elimane on Dec, 2020, at 18:36
 */
public class WarioCommandUp implements Command {

  private MarioCharacter character;

  public WarioCommandUp(MarioCharacter character) {
    this.character = character;
  }

  @Override
  public void execute() {
    character.moveUp();
  }
}
