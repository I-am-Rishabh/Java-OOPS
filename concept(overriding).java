// Base class Person
class Person {
    String name;
    int age;

    // Method to print information
    public void printInfo() {
        System.out.println("Person's name: " + name);
        System.out.println("Person's age: " + age);
    }
}

// Derived class Student that extends Person
class Student extends Person {
    String school;

    // Overriding the printInfo method
    @Override
    public void printInfo() {
        // Calling the overridden method from the superclass
        super.printInfo();//not neccesary to call.
        System.out.println("School: " + school);
    }
}

public class concept5 {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student();
        s1.name = "Rishabh Prasad";
        s1.age = 22;
        s1.school = "JSS Academy of Technical Education";

        // Call the overridden printInfo method
        s1.printInfo();
    }
}
