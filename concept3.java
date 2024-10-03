//Constructor
class Student{
    String name;
    int age;
    
    //Parameterizedconstructor:
    Student(String name , int age){
           this.name= name;
           this.age=age;

    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class concept3{
    public static void main(String args[]){
        Student s1 =new Student("Rishabh Prasad",22);
         s1.getInfo();
         
    }
}