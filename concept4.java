//Constructor

//also in java we dont have destructor because of garage collector 
class Student{
    String name;
    int age;
    
    //Copy constructor:
    Student(Student s2){
           this.name= s2.name;
           this.age=s2.age;

    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// default construtor for line 26 construtor 
    Student(){

    }
}


public class concept4{
    public static void main(String args[]){
        Student s2 = new Student();
        s2.name="Rishi";
        s2.age=15;

        Student s1 =new Student(s2);
         s1.getInfo();
         
    }
}