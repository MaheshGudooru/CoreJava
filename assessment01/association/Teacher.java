package association;

//

public class Teacher {

    Student student;

    Teacher(Student s) {
        student = s;
    }

    static void main() {
        Teacher teacher = new Teacher(new Student("fdf", 45));
    }
}
