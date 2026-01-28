package inheritance.singlelevel;

public class Humans extends Animals{

    Humans() {
        System.out.println("Hey we are humans!!");
    }

    @Override
    public void canSpeak() {
        System.out.println("can Speak");
    }
}
