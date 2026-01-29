package abstraction.abstract_classes;

//
// Abstract class are blueprint for other class.
// Abstract class are used to enforce certain rules on the class that extend them
// can have both abstract methods(methods without implementation) and concrete methods(methods with implementation)
// cannot create objects for abstract classes directly
// provide partial abstraction since concrete methods are supposed
// can have states(members of instantiated class) and constructors
//
//                "MUST DO THESE THINGS BUT I WON'T TELL YOU HOW"
//
// ex: Techouts is an abstract class has abstract methods "learnedJava" and "learnedPython"
// Techouts does not care about how you learned those languages (could have learned by watching tutorials, reading coding books etc..)
// But you should know Java and Python(implementation)




abstract class TechOuts {

    int employeeID;

    TechOuts(int id) {
        employeeID = id;
        System.out.println("yes constructors are supported for abstract class!");
    }

    public abstract void learnedJava();
    public abstract void learnedPython();

    public void canDoTheJob() {
        System.out.println("Yes!");
    }

}

// so if Rakesh is an intern at TechOuts he should definitely learn Java and Python (i.e., implement "learnedJava" and learnedPython)

class Rakesh extends TechOuts {

    Rakesh(int id) {
        super(id);
    }

    @Override
    public void learnedJava() {
        System.out.println("learned Java through project based learning!");
    }

    @Override
    public void learnedPython() {
        System.out.println("learned Python by watching tutorials!");
    }
}

class Test {
    public static void main(String[] args) {

        System.out.println("NORMAL SUBCLASS");
        Rakesh r = new Rakesh(69696969);
        r.learnedJava();
        r.learnedPython();
        r.canDoTheJob();
        System.out.println(r.employeeID);
        System.out.println();

        System.out.println("ANONYMOUS SUBCLASS");
        TechOuts obj = new TechOuts(8787878) {     // This will work only when both the class and methods are abstract
            @Override                       // internally created "Anonymous subclass" for TechOuts class
            public void learnedJava() {     // so "TechOuts obj = new TechOuts()" this is not instantiating TechOuts class but
                // creating a subclass without a name(anonymous subclass) and instantiating that subclass
                System.out.println("defined");
            }

            @Override
            public void learnedPython() {
                System.out.println("defined");
            }
        };
        obj.learnedJava();
        obj.learnedPython();
        System.out.println(obj.employeeID);


//        TechOuts obj = new TechOuts(); // This won't work

    }
}


