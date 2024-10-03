//Constructor
class Student{
    String name;
    int age;
   
   //if the below constructor was not defined the  default constructor was initialized
   // only called once in creation of object  
   //non-paramaterized constructor
    Student(){
        System.out.println("constructor called");
    }
}


public class concept2{
    public static void main(String args[]){
        Student s1 =new Student();
        // Student() construtor creates objects
        //new keyword :- memory in heap is allocated for object storage
          s1.name="Rishabh";
          s1.age=22;
          
    }
}