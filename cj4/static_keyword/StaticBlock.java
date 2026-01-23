package static_keyword;

public class StaticBlock {


    static int age;
    String name;

    // if there is no static keyword even then the code executes correctly but then this block will be called as "initializer block"(executes for every object created)
    static {    // This block will only execute once by the JVM when the class is being loaded into the memory(even before any object creation) so executed even before main method
                // or object creation
        age = 21;// belongs to class no object since static
        System.out.println("Hey look I don't need main method anymore!"); // this statement was true before JDK -v 1.6
        System.out.println("Just Kidding bruh!");
    }

    {
        name = "techouts";  // Initializer block
        System.out.println("Inside initializer block"); // this block runs everytime an object is created, before the execution of constructor
        // belongs to object rather than class
    }

    StaticBlock() {
        System.out.println("I am inside the constructor or maybe my class has a new instance!");
    }

    public void printSmtg() {
        System.out.println("Printing something..");
    }

    static void main(String[] args) {

        System.out.println(StaticBlock.age);

        StaticBlock obj01 = new StaticBlock();

        obj01.printSmtg();

        System.out.println(obj01.name);

        StaticBlock obj02 = new StaticBlock();

        obj02.printSmtg();

    }

}
