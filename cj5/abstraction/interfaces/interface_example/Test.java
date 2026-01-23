package interfaces.interface_example;

public class Test {
    static void main() {

        TechOuts techouts = new TechOuts();
        techouts.branch();
        techouts.website();
        techouts.employee();

        Company.helper(); // calling static method directly from the interface
        techouts.printRunning(); // indirectly calling static method

        techouts.printName(); // calling the default method in the interface which internally uses a private method
    }
}
