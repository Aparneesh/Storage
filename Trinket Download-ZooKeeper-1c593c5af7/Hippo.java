/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved{

  public Hippo(String food, boolean isNocturnal, double getLifeSpan){
    super(food, isNocturnal, getLifeSpan);
  }

  public Hippo(){
  }

  public void groan()
  {
    System.out.println("The hippo groans.");
  }

  public void speak(){
    groan();
  }
}