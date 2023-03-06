public class Tiger extends Feline {

    public Tiger(String food, boolean nocturnal,double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }

    public Tiger(){
    }

    public void huntAlone(){
        System.out.println("The tiger has hunted alone");
    }
    
    public void swim(){
        System.out.println("Tiger has swam");
    }

    public void speak(){
        System.out.print("ROAR");
    }
}
