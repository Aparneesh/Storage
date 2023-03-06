public class Owl extends Bird{
    public Owl(String food, boolean isNocturnal, double getLifeSpan){
        super(food, isNocturnal, getLifeSpan);
    }
    
    public Owl(){
    }

    public void hunt(){
        System.out.println("The Owl has hunted");
    }

    public void speak(){
        System.out.println("HOOT");
    }
}
