package inheritance.hierarchical;

public class Test {
    static void main() {
        Cows cow = new Cows();
        cow.canEat();
        cow.canEatGrass();
        cow.canBreath();
        cow.canSleep();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.canEat();
        tiger.canEatMeat();
        tiger.canBreath();
        tiger.canSleep();
    }
}
