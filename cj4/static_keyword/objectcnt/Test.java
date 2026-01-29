package static_keyword.objectcnt;

public class Test {

    public static void main(String[] args) {
        ObjectCnt obj01 = new ObjectCnt();
        ObjectCnt obj02 = new ObjectCnt();
        ObjectCnt obj03 = new ObjectCnt();
        ObjectCnt obj04 = new ObjectCnt();

        // System.out.println(ObjectCnt.objCnt++); // This does not work
        ObjectCnt.printCnt();


    }
}