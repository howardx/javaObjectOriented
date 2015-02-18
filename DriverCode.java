package objectOriented;

public class DriverCode
{
	
  /*
   * For standalone applications you must either have

   * 1. a main method or (prefered)
   * 2. a static initializer.

   * for java web application we donnot need main() method
   */
  public static void main(String args[])
  {
    Car l = new Lamborghini(0, 88888, true, "coupe", "Lamborghini");
    Car m = new Murcielago(0, 99999, true, "coupe", "Lamgorghini", 'y');
    
    Lamborghini l1 = new Lamborghini(0, 88888, true, "coupe", "Lamborghini");
  
    /*
     * Here we are actually calling methods in the
     * SUB/CHILD CLASS
     */
    l.pumpGasIn();
    l.driveOnMud();
    l.driveOnRoad();
    
    /*
     * ifFriendBorrows() method CANNNOT be accessed by
     * object "l" defined above directly,
     * 
     * as it's a reference of "Car" type, and the method
     * is defined in the subclass ONLY, NOT inheriented
     */
    l1.ifFriendBorrows();
    
    /* through DOWN CASTING, we can access
     * methods in subclass
     */
    Murcielago m1 = (Murcielago) m;
    m1.ifFriendBorrows();
    
    m.driveOnMud();
    
  }

}
