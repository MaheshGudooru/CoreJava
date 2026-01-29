package class_relations.aggregation;

import java.util.HashSet;
import java.util.Set;


// In this example both TechOuts and Interns are associated through their objects
// TechOuts has many interns so one-many relation
// note: TechOuts "has" Interns

public class Aggregation {

    public static void main(String[] args) {

        TechOuts techouts = new TechOuts();

        Set<Interns> internsList = new HashSet<>();

        Interns mahesh = new Interns("Mahesh", 21);
        internsList.add(mahesh);

        Interns ganesh = new Interns("Ganesh", 21);
        internsList.add(ganesh);

        Interns manoj = new Interns("Manoj", 21);
        internsList.add(manoj);

        Interns shivaram = new Interns("Shivaram", 21);
        internsList.add(shivaram);

        techouts.addInterns(internsList);

        System.out.println("Number of interns at TechOuts: " + techouts.getInternsCnt());
    }
}
