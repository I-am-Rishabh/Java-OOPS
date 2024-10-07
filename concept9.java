//Static keyword 

class Student{
    String name;
    // we set the value of this from direct this class and also from its object .. any change  will change the value in the class also 
    static String school;// The static keyword in Java is used to indicate that a particular field, method, or nested class belongs 
    //to the class itself rather than to instances of the class (objects).
    
    public static void changeSchool(){
        school="newshool";
    }
}

public class concept9{
    public static void main(String[] args) {
         Student.school="KV";
         //here we are  setting value of school for all future obj;
         //we can also change for all student the school from one change;
         Student s1 =new Student();
         s1.school="dps";

         System.out.println(s1.school+" "+Student.school);

    }
}
