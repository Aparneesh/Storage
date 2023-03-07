public class Elephant extends Animal{

    public Elephant(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }

    public Elephant(){
    }

    public void trumpet(){
        System.out.println("TOOT TOOT");
    }

    public void forage(){
        System.out.println("The elephant has found food");
    }

    public void speak(){
        trumpet();
    }

    public String toString()
    {
    return "This is an object of the Elephant class.";
    }
    
}
