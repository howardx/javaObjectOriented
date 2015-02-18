package objectOriented;

abstract class Car
{
  protected int price;
  protected long milage;
  protected boolean allWheelDrive;
  
  protected String type; // sedan or coupe or truck etc.
  protected String maker; // brand
  
  protected Car() {}
  
  protected Car(long milage, int price, boolean allWheelDrive)
  {
    this.milage = milage;
    this.price = price;
    this.allWheelDrive = allWheelDrive;
  }
 
  /*
   * final modified method, can be inheriented, but NOT overriden
   */
  final protected void driveOnRoad()
  {
    System.out.println("Car is driving on road, it's flat");
  }
  
  /*
   * public method, can be accessed anywhere, no restrictions, even outside the package 
   */
  public void driveOnMud()
  {
    System.out.println("Car is driving on Mud, it's muddy");
  }

  /*
   * class method without a access modifier (public/private/protected)
   * can be accessed within
   *   - the container class, and
   *   - other classes in the same package of the containing class
   */
  void driveOnGrass()
  {
    System.out.println("Car is driving on grass, get off the grass!");
  }
 
  /*
   * abstract method, can ONLY show up in interfaces and abstract classes
   * CANNOT have a method body
   * --> MUST BE IMPLEMENTED/OVERRIDEN by sub classes
   */
  abstract void pumpGasIn();

  /*
   * static method, can be used without instantiateing the class or subclass
   * has only "1 copy", can't use "this" keyword within 
   */
  static void openDoor()
  {
    System.out.println("the car has opened its door");
  }

  /*
   * private method, if not used locally a warning message will be thrown as
   * private methods can ONLY be accessed within the container class
   */
  private void driveOnWater()
  {
    System.out.println("Car is driving on water, it's wet.");
  }
}