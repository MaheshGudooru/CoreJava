package comparable_usage;

// Comparable interface is used to define the natural order of the objects of a class
// defines how the objects of same class should be ordered
// override the compareTo method to implement the custom order logic
// the return type is int
// -1 if this object is less than the other object
// 0 if both are equal
// 1 if this object is naturally greater than the other object
// in case of comparable we can only have one sorting order logic

public class Player implements Comparable<Player>{

    String name;
    int performanceScore;

    Player(String name, int performanceScore) {
        this.name = name;
        this.performanceScore = performanceScore;
    }

    public void printPlayer() {
        System.out.println ("Player: " + this.name + " " + "Score: " + this.performanceScore);
    }


    @Override
    public int compareTo(Player other) {
        if(this.performanceScore == other.performanceScore) {
            return this.name.compareTo (other.name); // by default compares two strings lexically(natural order)
        }

        return other.performanceScore - this.performanceScore;

    }
}
