package encapsulation;

// encapsulation is a concept of binding data and methods into a single unit.
// It limits the access to data by enforcing access control and providing a specific set of methods(getters and setters) to access these restricted data members(private members)


// data binding is the process of connecting data of a program to it's methods
// can be done with the help of getters and setters

public class Task {
    private String task;
    private boolean isCompleted;

    Task(String task, boolean isCompleted) {
        this.task = task;
        this.isCompleted = isCompleted;
    }

    public String getTask() {
        return task; // Getter
    }

    public boolean getStatus() {
        return isCompleted;
    }

    public void setTask(String task) {

        if(!task.toLowerCase().contains("complete")){
            System.out.println("unable to process!!!!");
            return;
        }
        this.task = task; // Setter
    }

    public void setStatus(boolean completed) {
        isCompleted = completed;
    }

    public void printTask() {
        System.out.println(task + " is " + (isCompleted ? "completed" : "not completed"));
    }

}

class Test{
    static void main() {

        Task task01 = new Task("complete cj7 module", false);
        task01.printTask();

        Task task02 = new Task("study multithreading concepts in depth", false);
        task02.printTask();

        Task task03 = new Task("complete OOPs in Java", true);
        task03.printTask();

//        task02.task = "replacing task name";
//
//          this will through an error since the private members can only be accessed within the class so rather than handling the data directly we create a gateway for access
        //  through getters and setters, specifying appropriate logic to these so that data consistency and validity is maintained.
        task02.setStatus(true);
        task02.printTask();

    }
}
