package inheritance.multilevel;

public class Carnivores extends Mammals{

    Carnivores() {
        System.out.println("I am a Carnivores");
    }
    public void canEatMeat(String carnivores) {
        System.out.println(carnivores + " can eat meat");
    }

    static void main() {
        Carnivores tiger = new Carnivores();
        tiger.whoAmI("Tiger");
        tiger.canEat("tiger");
        tiger.canGiveMilk("tiger");
        tiger.canEatMeat("tiger");
    }
}
