package interfaces.interface_example;

public class TechOuts implements Company{
    @Override
    public void branch() {
        System.out.println("we have branch in Virginia");
    }

    @Override
    public void website() {

        System.out.println("we have a website!");
    }

    @Override
    public void employee() {
        System.out.println("we have employees");
    }

    public void printRunning() {
        Company.helper();
    }


}

