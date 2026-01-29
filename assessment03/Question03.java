public class Question03 {

    public void m1() {
        System.out.println("This is method 01");
    }

    public void m2() {
        m1();
        System.out.println("This is method 02");
    }

    public static void main(String[] args) {
        Question03 obj = new Question03();
        obj.m2();

//        output:
//                This is method 01
//                This is method 02
    }
}
