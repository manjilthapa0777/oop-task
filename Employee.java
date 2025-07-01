
class EmployeeBase {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000.0;
    }
}

class HRManager extends EmployeeBase {
    @Override
    void work() {
        System.out.println("HR Manager is recruiting and managing employee relations");
    }
}

public class Employee {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();                                 // Overridden method
        System.out.println("Salary: " + hr.getSalary());  // Inherited method
    }
}

