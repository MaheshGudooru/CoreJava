package hierarchical;

public class Test {
    static void main() {
        Cows cow = new Cows();
        cow.canEat();
        cow.canEatGrass();
        cow.canBreath();
        cow.canSleep();
        Tiger tiger = new Tiger();
        tiger.canEat();
        tiger.canEatMeat();
        tiger.canBreath();
        tiger.canSleep();
    }
}
