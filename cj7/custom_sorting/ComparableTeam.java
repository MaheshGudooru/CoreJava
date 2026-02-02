package comparable_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Team {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<> ();

        playerList.add(new Player ("ronaldo", 99));
        playerList.add(new Player ("messi", 99));
        playerList.add(new Player ("Mbappe", 100));
        playerList.add(new Player ("nemor", 98));

        Iterator<Player> i = playerList.iterator ();

        System.out.println ("Before ordering");
        while(i.hasNext ()) {
            i.next ().printPlayer ();
        }

        System.out.println ();
        System.out.println ("after ordering");
        Collections.sort (playerList); // first sorts by score if two players have same score then checks the name
        for(Player p : playerList) {
            p.printPlayer ();
        }

    }

}
