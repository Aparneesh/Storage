/*
 * Activity 4.9.2
 */
public class Hooved extends Animal{


  public Hooved(String food, boolean isNocturnal, double getLifeSpan){
    super(food, isNocturnal, getLifeSpan);
  }

  public Hooved(){
    
  }
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
  
}