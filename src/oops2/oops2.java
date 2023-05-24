package oops2;
abstract class Animal{
    Animal(){
        System.out.println("You are creating a new animal");
    }
  abstract void  walk();
  public void eat(){
      System.out.println("Animal Eat");
  }


}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a horse");
    }
    public void  walk(){
        System.out.println("Walking with 4 legs");
    }

}
class chicken extends Animal{
    chicken(){
        System.out.println("You are creating a chicken");
    }
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}



public class oops2 {
    public static void main(String[] args) {
      Horse horse = new Horse();

    }
}
