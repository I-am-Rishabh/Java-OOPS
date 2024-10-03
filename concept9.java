//Static keyword 

class Student{
    String name;
    static String school;// we can specify it  for any new obj it is generalized for obj 
    
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