package objectOriented;

public class Murcielago extends Lamborghini
{
  Murcielago(long milage, int price, boolean allWheelDrive, String type, String maker, char color)
  {
    super(milage, price, allWheelDrive, type, maker);
    
    /*
     * class member variable of ALL parent classes are inheriented
     */
    this.color = color;
  }

  /*
   * method can be further overriden in sub classes
   * NOT NECESSARY
   */
  @Override
  void pumpGasIn()
  {
   System.out.println("my gas tank is on the LEFT hand side");
  }
  
  @Override
  protected void ifFriendBorrows()
  {
    System.out.println("this time it's oK");
  }
}