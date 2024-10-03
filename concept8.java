//abstraction type-2 via Interfaces 
// interfaces don't have constructors 

interface Animal{
    //all properties of interfaces are public, static and final by default
    int eyes=2;//this is common for all the classes implementing Animal
    void walk();//his is by default public and abstract and here only defining is done 
}
//java also supports multiple interface
    interface grass{

    }
 class Horse implements Animal, grass{
    public void walk(){// implementation of walk() is  done here
        System.out.println("walks on 4 legs");
    }

    public void run(){
         System.out.println("horse is runnning");
    }
 }

 
public class concept8{
    public static void main(String[] args) {
    Horse h1 = new Horse();
   int x=Horse.eyes;
   //x=Horse.eyes,Animal.eyes,h1.eyes;
      h1.walk();
      h1.run();
    System.out.println(x);
}
}