public class CourseWork1 {public static void printCredentialsEmployees(Employee[] employeeList) {
    System.out.println();
    for (Employee employee : employeeList) {
        if (employee != null) {
            System.out.println(employee.getEmployeeName());

        }
    }
}

    public static int countAverageSalary(int sumSalaries, int count) {
        return sumSalaries / count;

    }

    public static String findMaxSalaryEmployee(Employee[] employeeList) {
        String maxSalaryEmployee = "";
        int maxEmployeeSalary = -1;
        for (Employee employee : employeeList) {
            if (employee != null) {
                int employeeSalary = employee.getEmployeeSalary();
                if (employeeSalary > maxEmployeeSalary) {
                    maxEmployeeSalary = employeeSalary;
                    maxSalaryEmployee = employee.getEmployeeName();
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static String findMinSalaryEmployee(Employee[] employeeList) {
        String minSalaryEmployee = "";
        int minEmployeeSalary = countSumSalaries(employeeList);
        for (int i = 0; i < employeeList.length; i++) {
            Employee employee = employeeList[i];
            if (employee != null) {
                int employeeSalary = employee.getEmployeeSalary();
                if (employeeSalary < minEmployeeSalary) {
                    minEmployeeSalary = employeeSalary;
                    minSalaryEmployee = employee.getEmployeeName();
                }

            }

        }
        return minSalaryEmployee;
    }

    public static void printEmployeeList(Employee[] employeeList) {

        for (Employee employee : employeeList) {

            if (employee != null) {
                System.out.println(employee + "\n");
            }
        }
    }

    public static int countSumSalaries(Employee[] employeeList) {
        int sumSalaries = 0;
        for (Employee employee : employeeList) {
            if (employee != null) {
                sumSalaries += employee.getEmployeeSalary();
            }
        }
        return sumSalaries;
    }

    public static void main(String[] args) {

        int count = 0;

//        String[] employeeList = new String[10];

        Employee[] employee = new Employee[10];

        Employee employee1 = new Employee("Иванов Иван Иванович", 5, 50_000);
        Employee employee2 = new Employee("Петров Пётр Петрович", 4, 100_000);
        Employee employee3 = new Employee("Сидоров Сидр Сидорович", 3, 150_000);
        Employee employee4 = new Employee("Фёдоров Фёдор Фёдорович", 2, 200_000);
        Employee employee5 = new Employee("Степанов Степан Степанович", 1, 250_000);

        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[3] = employee4;
        employee[4] = employee5;

        for (Employee value : employee) {
            if (value != null) {
                count++;
                value.id = count;
            }
        }
        printEmployeeList(employee);
        System.out.println("Сумма затрат на зарплаты сотрудников = " + countSumSalaries(employee) + " рублей в месяц");
        System.out.println("Сотрудник с минимальной зарплатой - " + findMinSalaryEmployee(employee));
        System.out.println("Сотрудник с максимальной зарплатой - " + findMaxSalaryEmployee(employee));
        System.out.println("Средняя зарплата сотрудников - " + countAverageSalary(countSumSalaries(employee), count) + " рублей в месяц");
        printCredentialsEmployees(employee);
    }
}
