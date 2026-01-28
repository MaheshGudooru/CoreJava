package inheritance.multilevel;

public class Mammals extends Animals{

    Mammals() {
        System.out.println("I am a mammal");
    }
    public void canGiveMilk(String mammal) {
        System.out.println(mammal + " can give milk");
    }
}
