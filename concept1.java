//classes and object
class Student{
   String name;
   int age;

   public void getInfo(){
    System.out.println("the name of the student is "+this.name);
    System.out.println("the age of the student is "+this.age);
    
   }
}

public class concept1{
    public static void main(String args[]){
       Student s1=new Student();
       s1.name="Rishabh Prasad";
       s1.age=22;
       s1.getInfo();
    }
}