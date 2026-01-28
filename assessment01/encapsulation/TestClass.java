package encapsulation;

public class TestClass {

    static void main() {
        Encapsulation obj = new Encapsulation();
        obj.setName("TechOuts");
        obj.setNumber(785768);

//        obj.name;
//        obj.number; // gives error since private access

        System.out.println(obj.getName());
        System.out.println(obj.getNumber());

    }
}
