package generics;

// instead of writing different classes for different datetypes we use one generic class that can handle different datatypes
//  generic class are parameterized(uses a general type that does not correspond to any particular datatype) so the datatype of the parameter is defined during the object creation

public class GenericClass<k, v>{

    k key;
    v value;

    GenericClass(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public void printDetails() {

        System.out.println ("Key: " + getKey () + " " + "Value: " + getValue ());
    }

    public k getKey() {
        return this.key;
    }

    public v getValue() {
        return this.value;
    }

}
