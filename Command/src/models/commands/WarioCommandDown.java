package models.commands;

import interfaces.Command;
import models.characters.WarioCharacter;

/**
 * Created by Elimane on Dec, 2020, at 18:36
 */
public class WarioCommandDown implements Command {

  private WarioCharacter character;

  public WarioCommandDown(WarioCharacter character) {
    this.character = character;
  }

  @Override
  public void execute() {
    character.moveDown();
  }
}
