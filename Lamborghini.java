package objectOriented;

public class Lamborghini extends Car
{
  public char color;
  Lamborghini(long milage, int price, boolean allWheelDrive, String type, String maker)
  {
    /*
     *  calls constructor of the parent class
     */
    super(milage, price, allWheelDrive);
    this.type = type;  
    this.maker = maker;
  }
  
  /*
   * MUST implement abstract method from parent class
   */
  @Override
  void pumpGasIn()
  {
  	System.out.println("my gas tank is on the right hand side");
  	System.out.println("I need 50 gallons of gas, premium 93 only");
  }
 
  /*
   * Though we CAN override a parent class method's body
   * we CANNOT override its accessibility (public/protected)
   */
  @Override
  public void driveOnMud()
  {
  	System.out.println("This is a Lamborghini, I can't drive it on mud.");
  }
  
  /*
   * HOWEVER, if we didn't defined a method's access modifier,
   * WE CAN ASSIGN IT WHEN OVERRIDING 
   */
  @Override
  protected void driveOnGrass()
  {
  	System.out.println("This is a Lamborghini, I can't drive it on grass.");
  }
  
  /*
   * sub class can define new functions
   */
  protected void ifFriendBorrows()
  {
    System.out.println("stay away from my lambo!");
  }
 
  /*
   * in concrecte class, we CANNOT declare abstract methods
   */
}
