package inheritance.hierarchical;

public class Cows extends Animal{

    Cows() {
        System.out.println("I am a cow but I am also an animal");
    }

    public void canEatGrass() {
        System.out.println("Cows can eat grass");
    }
}
