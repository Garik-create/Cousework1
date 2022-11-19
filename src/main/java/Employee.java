import org.apache.commons.lang3.StringUtils;

public class Employee {
    public String employeeName;
    private int departmentId;
    private int employeeSalary;
    private static int counter;
    private final int id;

    public Employee(String employeeName, int departmentId, int employeeSalary) {

        setEmployeeName(employeeName);
        this.departmentId = departmentId;
        this.employeeSalary = employeeSalary;
        this.id = ++counter;
    }

    public void setEmployeeName(String employeeName) {
        if (this.employeeName == null) {
            changeNameToUpperCase(employeeName);
        } else {
            System.out.println("Такой работник уже в наличии!");
        }
    }

    private String changeNameToUpperCase(String employeeName) {
        String str = StringUtils.defaultIfBlank(employeeName, "400 Bad Request");
        if (!str.equals("400 Bad Request")) {
            String[] strings = StringUtils.split(employeeName);
            String[] strings2 = new String[strings.length];
            for (int i = 0; i < strings2.length; i++) {
                strings2[i] = StringUtils.capitalize(strings[i]);
            }
            employeeName = StringUtils.join(strings2, " ");
//            System.out.println(employeeName);
        } else {
            throw new RuntimeException("400 Bad Request");
        }
        return this.employeeName = employeeName;
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
        return id + ": " + employeeName + "\nЗарплата: " + employeeSalary + "\nОтдел: " + departmentId+"\n";
    }
}
