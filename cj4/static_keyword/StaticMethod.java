package static_keyword;

public class StaticMethod {

    public String space = " ";

    public static String concatenate(String str1, String str2) {  // Static method so no object creation is required

        System.out.println("I cannot use this or super since I have nothing to do with object or other class.");
        System.out.println("I am the single source of truth!!!....");

        return str1 + " " + str2;

        //return modifyData(str1, str2); // This will also not work
        //return str1 + space + str2; // This will not work(would have worked if space is a static member) since static methods can only access static members and other static methods
    }

    public String modifyData(String s1, String s2) {
        return s1.toUpperCase() + " " + s2.toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println("called using the class name");
        System.out.println(StaticMethod.concatenate("Mahesh", "TechOuts"));
        System.out.println();

        System.out.println("called the static method directly");
        System.out.println(concatenate("Mahesh", "TechOuts")); // directly calling static method since we are inside the class itself
        System.out.println();

        StaticMethod obj = new StaticMethod();
        System.out.println("called by creating the object");
        System.out.println(obj.concatenate("Mahesh", "TechOuts")); // This will work but why waste precious memory when the method is static (does not change either way)
        // and also cause confusion when someone is reading my code
    }
}
