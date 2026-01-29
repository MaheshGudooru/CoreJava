package inheritance.singlelevel;

public class Test {

    public static void main(String[] args) {

        Animals tiger = new Animals();
        Animals jake = new Humans();

//        output:
//                Hey we are animals!!
//                Hey we are animals!!
//                Hey we are humans!!

        // Animals <- Humans

        jake.canSpeak();
        jake.canEat();

        tiger.canSpeak();
        tiger.canEat();
    }
}

// Why Java does not support multiple inheritance

// if both the superclass has same method but with different implementation JVM will be confused on which method should be called
