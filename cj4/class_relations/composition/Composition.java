package class_relations.composition;

// TechOuts office is a "part of" vaishnavi cynosure so without the cynosure itself it wouldn't exist i.e., the office

// so here Office object completely depends on the VaishnaviCynosure so without cynosure it wouldn't make sense for the Office object to exist

import java.util.HashSet;
import java.util.Set;

public class Composition {

    public static void main(String[] args) {

        VaishnaviCynosure vaishnaviCynosure = new VaishnaviCynosure();

        Set<Office> companiesList = new HashSet<>();

        Office techOuts = new Office("TechOuts", 50);
        companiesList.add(techOuts);

        Office hyundai = new Office("Hyundai", 48);
        companiesList.add(hyundai);

        Office Cpen = new Office("CPen", 23);
        companiesList.add(Cpen);

        Office zenTree = new Office("ZenTree", 34);
        companiesList.add(zenTree);

        Office intelWorld = new Office("IntelWorld", 54);
        companiesList.add(intelWorld);

        vaishnaviCynosure.addOffice(companiesList);
        vaishnaviCynosure.printOffices();

    }
}
