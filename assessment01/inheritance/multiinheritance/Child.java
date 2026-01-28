package inheritance.multiinheritance;

public class Child extends Parent02{

    static void main() {
        new Child().specificToParent01(); // parent02 inherited from parent01, child inherited from parent02
    }
}
