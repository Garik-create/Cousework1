public class EmployeeBook {

    private static Employee[] employees = new Employee[10];


    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                continue;
            }
            this.employees[i] = employee;
        }
    }
//
//
    private void findEmployeeLessThenMinSalaryLevel(int maxSalaryLevel) {
        for (Employee value : employees) {
            if (value != null && value.getEmployeeSalary() < maxSalaryLevel) {
                System.out.println(value);
            }
        }
    }

    private void findEmployeeMoreThenMinSalaryLevel(int minSalaryLevel) {
        for (Employee value : employees) {
            if (value != null && value.getEmployeeSalary() > minSalaryLevel) {
                System.out.println(value);
            }
        }
    }

    public void printDepartmentEmployees(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentId() == department) {
                System.out.println(employees[i].getEmployeeId() + " " + employees[i].getEmployeeName() + " " +
                        employees[i].getEmployeeSalary());

            }
        }
    }

    private void indexSalary(int percent) {
        for (Employee value : employees) {
            if (value != null) {
                value.setEmployeeSalary(value.getEmployeeSalary() + value.getEmployeeSalary()
                        * percent / 100);
                System.out.println(value.getEmployeeSalary());
            }
        }
    }

    private double countAverageSalaryInDepartment(int department) {
        int numberEmployeesInDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentId() == department) {
                numberEmployeesInDepartment++;
            }
        }
        return countSumSalariesInDepartment(department) / numberEmployeesInDepartment;
    }

    private double countSumSalariesInDepartment(int department) {
        double sumSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentId() == department) {
                sumSalaries = sumSalaries + employees[i].getEmployeeSalary();
            }
        }
        return sumSalaries;
    }

    private Employee findMinSalaryEmployeeInDepartment(int department) {
        double minSalary = countSumSalaries();
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentId() == department && employees[i].getEmployeeSalary()
                    < minSalary) {
                minSalary = employees[i].getEmployeeSalary();
                j = i;
            }
        }
        return employees[j];
    }

    private Employee findMaxSalaryEmployeeInDepartment(int department) {
        double maxSalary = -1;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartmentId() == department && employees[i].getEmployeeSalary()
                    > maxSalary) {
                maxSalary = employees[i].getEmployeeSalary();
                j = i;
            }
        }
        return employees[j];
    }

    public static void printCredentialsEmployees() {
        System.out.println();
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName());
            }
        }
    }

    private double countAverageSalary() {
        int numberEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                numberEmployees++;
            }
        }
        return (double) countSumSalaries() / numberEmployees;
    }

    private Employee findMaxSalaryEmployee() {
        double maxEmployeeSalary = -1;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() > maxEmployeeSalary) {
                maxEmployeeSalary = employees[i].getEmployeeSalary();
                j = i;
            }
        }
        return employees[j];
    }

    private Employee findMinSalaryEmployee() {
        double minEmployeeSalary = countSumSalaries();

        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() < minEmployeeSalary) {
                minEmployeeSalary = employees[i].getEmployeeSalary();
                j = i;
            }
        }
        return employees[j];
    }

    private void printEmployeeList() {

        for (Employee employee : employees) {

            if (employee != null) {
                System.out.println(employee + "\n");
            }
        }
    }

    private int countSumSalaries() {
        int sumSalaries = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalaries += employee.getEmployeeSalary();
            }
        }
        return sumSalaries;
    }

}
