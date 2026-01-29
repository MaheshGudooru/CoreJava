public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("No parameters!!!");
    }

    ConstructorOverloading(int a, int b) {
        System.out.println(a + b);
    }

    ConstructorOverloading(String str1, String str2) {
        System.out.println(str1 + " " + str2);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(3,4);
        new ConstructorOverloading("techouts", "interns");
    }
}
