package class_relations.association;

import java.util.ArrayList;
import java.util.List;

// Association is the fundamental concept that describes the relationship between two independent classes
// Here a computer can have many peripherals like two keyboards can be connected to a single computer
// and even after the computer cease to exist peripherals remain and similarly even without peripherals computer can still exist i.e., the CPU


public class Association {

    public static void main(String[] args) {

        Computer computer = new Computer();

        List<Peripherals> components = new ArrayList<>();

        Peripherals monitor = new Peripherals("Monitor", "output");
        components.add(monitor);

        Peripherals keyboard = new Peripherals("Keyboard", "Input");
        components.add(keyboard);

        Peripherals mouse = new Peripherals("Mouse", "Input");
        components.add(mouse);

        Peripherals printer = new Peripherals("Printer", "Output");
        components.add(printer);

        Peripherals webcam = new Peripherals("Webcam", "Input");
        components.add(webcam);

        computer.addPeripherals(components);

    }
}
