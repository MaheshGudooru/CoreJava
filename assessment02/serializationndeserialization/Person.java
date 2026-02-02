package serializationndeserialization;

import java.io.Serializable;

public class Person implements Serializable { // tells JVM that this class object can be serialized

    String name;
    int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
