//inheritance
/**
Inheritance in Java is a mechanism where one class (called the subclass or child class) 
    acquires the properties and behaviors (fields and methods) of another class (called the
superclass or parent class). Inheritance allows for code reuse, method overriding, and 
    polymorphism,
    and it helps to establish a natural hierarchical relationship between classes.
*/

/**
1.Single inheritance
2.Hierarchical inheritance
3. Multilevel inheritance
4.Hybrid inheritance
    */
//import java.util.*;
//import bank;
class Shape{
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l ,int h){
        System.err.println(1/2*l*h);
    }
}

class Circle extends Triangle{
    public void area(int r){
        System.err.println((3.14)*r*r);

    }
}

public class concept6{
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.area(10, 5);  // Calculates the area of the triangle
        
        Circle c = new Circle();
        c.area(7);  // Calculates the area of the circle
      //  bank.Account account1=new bank.Account();
      //  account1.name="sbi";
    }
}
