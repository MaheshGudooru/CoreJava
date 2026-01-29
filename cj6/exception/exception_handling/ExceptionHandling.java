package exception.exception_handling;

// exception - unexpected situation which halts the execution flow of the program

// by default every object extends the Object class in java
// Throwable is a subclass of Object class. only objects that are instances of Throwable class can be thrown or caught
// the main two subclasses of Throwable are Error and Exception

// the Exception class is the parent class for all the exceptions in Java
// the Error class represents errors. errors shouldn't be handled since they are serious and almost always caused by JVM

// the Exception class has RuntimeException subclass which is the parent class for all defined runtime exceptions(IndexOutOfBound, NullPointer, IllegalArgument...)

public class ExceptionHandling {

    public static void main(String[] args) {


        try {
            int a = 1 / 0;
//            int a = 10 / 5;   // contains the code that may or may not throw an exception
            System.out.println(a);
        } catch (RuntimeException e) {
            System.err.println(e);  // contains code for handling the exception
        } finally {
            System.out.println("this will execute no matter what even if the exception was occurred or not");
        }

        System.out.println("handled an exception..");
    }

}
