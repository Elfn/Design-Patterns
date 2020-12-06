package models.characters;

/**
 * Created by Elimane on Dec, 2020, at 18:20
 */
//Receiver
  //Here we encapsulate a request by binding a set of actions
  //On a specific receiver
public class WarioCharacter {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  //------------ACTIONS------------------------------

  public void moveUp(){
    System.out.println(this.getName()+" jumping up");
  }

  public void moveDown(){
    System.out.println(this.getName()+" moving down");
  }

  public void moveLeft(){
    System.out.println(this.getName()+" moving left");
  }

  public void moveRight(){
    System.out.println(this.getName()+" moving right");
  }
}
