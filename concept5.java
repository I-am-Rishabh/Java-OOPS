//Polymorphism
//type1 - compile time polymorphism or method overloading (Static)

/*
one function name , differnt functionalities.

Method over loading can be possible on the
 following basis:
 1. The type of the parameters passed to the function.
 2.The number of parameters passed to the function.
*/ 

class Student{
   String name;
   int age;

   public void printInfo(String name){
    System.out.println(name);  
   }

   public void printInfo(int age){
    System.out.println(age);  
   }

   public void printInfo(String name, int age){
    System.out.println(name);  
    System.out.println(age);  
   }
}

public class concept5{
    public static void main(String args[]){
       Student s1=new Student();
       s1.name="Rishabh Prasad";
       s1.age=22;
       s1.printInfo(s1.age);
       s1.printInfo(s1.name);
       s1.printInfo(s1.name,s1.age);
    }
}