package interfaces.marker_interface;

// Interfaces with no methods

// used to mark a class so that JVM treats it accordingly

import java.io.Serializable;

public class Marker implements Serializable {
    String name;
    int id;
}

// does not necessarily implement any method but by being serializable Java knows it can be converted to byte stream
