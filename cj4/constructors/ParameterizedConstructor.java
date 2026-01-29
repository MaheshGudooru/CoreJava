package constructors;

// takes parameter and can be overloaded

public class ParameterizedConstructor {

    String param01;
    String param02;

    ParameterizedConstructor(String p01, String p02) {
        param01 = p01;
        param02 = p02;
    }

    public void DisplayParams() {
        System.out.println("param01: " + param01);
        System.out.println("param02: " + param02);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("TechOuts", "Intern");
        obj.DisplayParams();
    }
}
