package objectOriented;

public class Honda extends Car
{
  protected Honda(long milage, int price, boolean allWheelDrive, String type)
  {
    super(milage, price, allWheelDrive);
    this.type = type;
  }
  
 
  /*
   * abstract method has to be overriden by DIRECT CHILD
   */
  @Override
  void pumpGasIn()
  {
  	System.out.println("I need 30 gallons of gas, 87, 89 or 93 will all work");
  }
}
