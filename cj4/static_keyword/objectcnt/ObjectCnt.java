package static_keyword.objectcnt;


public class ObjectCnt {

    private static int objCnt = 0; // static member so every object of this class gets the same data but made it private so other classes cannot access it directly

    ObjectCnt() {
        objCnt++;
    }

    public static void printCnt() {
        System.out.println("The number of objects for class ObjectCnt are: " + objCnt);
    }

}


