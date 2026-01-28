package composition;

public class Rooms {

    int roomNo;
    int roomSize;

    Rooms(int roomNo, int roomSize) {
        this.roomNo = roomNo;
        this.roomSize = roomSize;
    }

    public void getRoom() {
        System.out.println("Room No: " + roomNo);
        System.out.println("Room Size: " + roomSize);
        System.out.println();
    }

}
