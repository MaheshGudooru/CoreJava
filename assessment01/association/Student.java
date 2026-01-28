package association;

// both teacher and student can exist independently

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("name: " + name + " " + "age: " + age);
    }


    static void main() {
        Student s01 = new Student("tyt", 57);
        Student s02 = new Student("tyt", 7);
        Student s03 = new Student("tyt", 556);

        s01.printDetails();
        s02.printDetails();
        s03.printDetails();
    }
}
