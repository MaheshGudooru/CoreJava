package this_keyboard;

// this keyword refers to the current object

// cannot use inside static methods or with static members since they belong to class rather than any particular object

public class Employee {

    public String name;
    private int id;

    Employee(int id) {
        this("no name", id);  // constructor chaining this() calls the current object's constructor
    }

    Employee(String name, int id) {
        this.name = name; // here this.name refers to the member of the class "public String name" and "name" is the parameter
        this.id = id;
    }

    Employee() {
        setDefault(this); // passing current object as a parameter to "setDefault"
    }

    public void setDefault( Employee employee) {
        employee.name = "default";
        employee.id = 101010;
    }

    public Employee returnCurrent() {
        return this;    // returning current object
    }

    public void m1() {
        System.out.println("This is method-01");
    }

    public void m2() {

        this.m1(); // refers to the method m1 of the current object use for more readability
        m1(); // will work the same
        System.out.println("This is method-02");
    }

    static void main() {
        Employee e1 = new Employee();
        Employee e2 = new Employee(23457);
        Employee e3 = new Employee("abc", 3454);

        e2.setDefault(e1);
        e2.returnCurrent();
    }


}
