package constructors;

// mainly used to create objects with same values

public class CopyConstructor {

    private String employeeName;
    private String employeeCompany;

    CopyConstructor(String name, String company) {
        employeeName = name;        // I am not using this keyword since there is no ambiguity involved (members and parameters have different names)
        employeeCompany = company;
    }

    CopyConstructor(CopyConstructor obj) {
        this.employeeName = obj.employeeName;
        this.employeeCompany = obj.employeeCompany;
    }

    public void printDetails() {
        System.out.println("name: " + employeeName + "  " + "company: " + employeeCompany);
    }


    static void main(String[] args) {
        CopyConstructor obj01 = new CopyConstructor("Mahesh", "TechOuts");
        System.out.print("obj01 => ");
        obj01.printDetails();

        System.out.print("obj02 => ");
        CopyConstructor obj02 = new CopyConstructor(obj01);
        obj02.printDetails();
    }
}
