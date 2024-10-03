//abstraction tpye 1 by abstract class

//here in abstract class we cannot create its object
//
 abstract class Animal{

    Animal(){
        System.out.println("You are creating an animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
 }

 class Horse extends Animal{
    Horse(){
        System.out.println("horse is created");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
 }

 class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
    Chicken(){
        System.out.println("chicken a created");
    }

 }
public class concept7{
    public static void main(String[] args) {
       Horse horse =new Horse();
       horse.walk();
       Chicken chicken=new Chicken();
       chicken.walk();
      // Animal animal =new Animal();// this will give error an obj of abstract class can't be created 
    //   animal.walk();//this will also invalid 
       horse.eat();// this is valid
}
}