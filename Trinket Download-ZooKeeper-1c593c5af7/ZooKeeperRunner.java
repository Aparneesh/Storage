/*
 * Activity 4.9.2
 */
import java.util.ArrayList;
public class ZooKeeperRunner
{
  public static void hearTheAnimal(ArrayList<Animal> Animal){
    for (Animal a: Animal){
      a.speak();
    }
  }
  public static void main(String[] args)

  { 
    /*Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();

    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.eat();
    tiger.isNocturnal();
    tiger.getLifeSpan();

    Gorilla gorilla = new Gorilla();

    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();

    Hippo hippo = new Hippo("food", true, 19.2);
    hippo.eat();

    Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice, insects", true, 4.0);
    owl2.eat(); 

    ArrayList<Animal> animal = new ArrayList<Animal>();

    Animal animal1 = new Deer();
    Animal animal2 = new Elephant();
    Animal animal3 = new Giraffe();
    Animal animal4 = new Gorilla();
    Animal animal5 = new Hippo();
    Animal animal6 = new Lion();
    Animal animal7 = new Monkey();
    Animal animal8 = new Owl();
    Animal animal9 = new Penguin();
    Animal animal10 = new Tiger();

    animal.add(animal1);
    animal.add(animal2);
    animal.add(animal3);
    animal.add(animal4);
    animal.add(animal5);
    animal.add(animal6);
    animal.add(animal7);
    animal.add(animal8);
    animal.add(animal9);
    animal.add(animal10);


    hearTheAnimal(animal);*/


    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    //a.trumpet();

    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());

    



  }


}