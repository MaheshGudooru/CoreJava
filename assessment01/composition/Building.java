package composition;

// rooms cannot exist without a building
// ex.  without vaishnavi cynosure TechOuts wouldn't have an office in Secunderabad


import java.util.ArrayList;
import java.util.List;

public class Building {

    List<Rooms> rooms;

    Building(List<Rooms> rooms) {
        this.rooms = rooms;
    }

    static void main() {
        List<Rooms> list = new ArrayList<>();

        list.add(new Rooms(345, 5435));
        list.add(new Rooms(346, 5476));
        list.add(new Rooms(347, 9789));
        list.add(new Rooms(348, 2342));

        Building building = new Building(list);

    }
}
