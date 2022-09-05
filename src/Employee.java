public class Employee {
    private final String employeeName;
    int departmentId;
    int employeeSalary;
    int id;

    public Employee(String employeeName, int departmentId, int employeeSalary) {
        this.employeeName = employeeName;
        this.departmentId = departmentId;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeId() {
        return id;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }



    @Override
    public String toString() {
        return id + ": " + employeeName + "\nЗарплата: " + employeeSalary + "\nОтдел: " + departmentId;
    }
}
