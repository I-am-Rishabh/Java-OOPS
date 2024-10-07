// encapsulation    and  abstraction tpye 1 by abstract class


/**
Encapsulation in Java is the concept of wrapping the data (fields) and 
methods that operate on the data (functions) into a single unit or class, 
and restricting access to certain components of the object. This is done to
protect the internal state of the object and 
to prevent unauthorized or unintended access and modification.*/
class Employee {
    // Private fields (encapsulation)
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if(age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();

        // Setting values using setter methods
        emp.setName("Rishabh");
        emp.setAge(22);

        // Accessing values using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}


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
