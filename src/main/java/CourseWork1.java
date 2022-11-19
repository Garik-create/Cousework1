import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CourseWork1 {


    public static void findEmployeeLessThenMinSalaryLevel(int maxSalaryLevel) {
        for (Employee value : employee) {
            if (value != null && value.getEmployeeSalary() < maxSalaryLevel) {
                System.out.println(value);
            }
        }

    }

    public static void findEmployeeMoreThenMinSalaryLevel(int minSalaryLevel) {
        for (Employee value : employee) {
            if (value != null && value.getEmployeeSalary() > minSalaryLevel) {
                System.out.println(value);
            }
        }
    }

    public static void printDepartmentEmployees(int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentId() == department) {
                System.out.println(employee[i].getEmployeeId() + " " + employee[i].getEmployeeName() + " " +
                        employee[i].getEmployeeSalary());

            }
        }
    }

    public static void indexSalary(int percent) {
        for (Employee value : employee) {
            if (value != null) {
                value.setEmployeeSalary(value.getEmployeeSalary() + value.getEmployeeSalary()
                        * percent / 100);
                System.out.println(value.getEmployeeSalary());
            }
        }
    }

    public static double countAverageSalaryInDepartment(int department) {
        double avgSalary = 0;
        int numberEmployeesInDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentId() == department) {
                numberEmployeesInDepartment++;
            }
        }
        return countSumSalariesInDepartment(department) / numberEmployeesInDepartment;
//        return avgSalary;
    }

    public static int countSumSalariesInDepartment(int department) {
        int sumSalaries = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentId() == department) {
                sumSalaries = sumSalaries + employee[i].getEmployeeSalary();
            }
        }
        return sumSalaries;
    }

    private static Employee findMinSalaryEmployeeInDepartment(int department) {
        int minSalary = countSumSalaries();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentId() == department && employee[i].getEmployeeSalary()
                    < minSalary) {
                minSalary = employee[i].getEmployeeSalary();
                j = i;
            }
        }
        return employee[j];
    }

    private static Employee findMaxSalaryEmployeeInDepartment(int department) {
        int maxSalary = -1;
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentId() == department && employee[i].getEmployeeSalary()
                    > maxSalary) {
                maxSalary = employee[i].getEmployeeSalary();
                j = i;
            }
        }
        return employee[j];
    }


    private static Employee[] employee = new Employee[10];

    private static void printCredentialsEmployees() {
        System.out.println();
        for (Employee employee : employee) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName());
            }
        }
    }

    private static double countAverageSalary() {
        return countSumSalaries() / employee.length * 1.0;
    }

    private static Employee findMaxSalaryEmployee() {
        int maxEmployeeSalary = -1;
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getEmployeeSalary() > maxEmployeeSalary) {
                maxEmployeeSalary = employee[i].getEmployeeSalary();
                j = i;
            }
        }
        return employee[j];
    }

    private static Employee findMinSalaryEmployee() {
        int minEmployeeSalary = countSumSalaries();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getEmployeeSalary() < minEmployeeSalary) {
                minEmployeeSalary = employee[i].getEmployeeSalary();
                j = i;
            }
        }
        return employee[j];
    }

    private static void printEmployeeList() {
        System.out.println(Arrays.toString(employee));
        System.out.println();
    }


    private static int countSumSalaries() {
        int sumSalaries = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                sumSalaries += employee.getEmployeeSalary();
            }
        }
        return sumSalaries;
    }


    public static void main(String[] args) {


        employee[0] = new Employee("иванов иван иванович", 5, 50_000);
        employee[1] = new Employee("петров Пётр петрович", 4, 100_000);
        employee[2] = new Employee("сидоров сидр Сидорович", 3, 150_000);
        employee[3] = new Employee("фёдоров фёдор Фёдорович", 2, 200_000);
        employee[4] = new Employee("Степанов Степан Степанович", 1, 250_000);
        employee[5] = new Employee("Толстой Алексей Николаевич", 1, 75_000);
        employee[6] = new Employee("Пушкин Александр Сергеевич", 2, 125_000);
        employee[7] = new Employee("Гоголь николай Васильевич", 3, 225_000);
        employee[8] = new Employee("сладков Николай", 4, 275_000);
        employee[9] = new Employee("Жидков жорис", 5, 175_000);


        printEmployeeList();
//        System.out.println("Сумма затрат на зарплаты сотрудников = " + countSumSalaries() + " рублей в месяц");
//        System.out.println("\nСотрудник с минимальной зарплатой\n" + findMinSalaryEmployee());
//        System.out.println("\nСотрудник с максимальной зарплатой\n" + findMaxSalaryEmployee());
//        System.out.println("Средняя зарплата сотрудников - " + countAverageSalary() + " рублей в месяц");
//        printCredentialsEmployees();

//        System.out.println("\nHighLevel");
//        System.out.println();


//
//        int department = 5;
//        System.out.printf("\nСотрудник с максимальной зарплатой в отделе %d - %s", department,
//                findMaxSalaryEmployeeInDepartment(department));
//        System.out.printf("\nСотрудник с минимальной зарплатой в отделе %d - %s", department,
//                findMinSalaryEmployeeInDepartment(department));
//        System.out.printf("\nСумма затрат на зарплату по отделу %d - %d рублей", department,
//                countSumSalariesInDepartment(department));
//        System.out.printf("\nСредняя зарплата по отделу %d - %g рублей\n", department,
//                countAverageSalaryInDepartment(department));
//        int percent = 10;
//        indexSalary(percent);
//        System.out.println();
//        System.out.printf("Список сотрудников %d отдела:\n", department);
//        printDepartmentEmployees(department);
//
//        int minSalaryLevel = 150_000;
//        System.out.printf("\nСписок сотрудников с зарплатой более %d рублей:\n", minSalaryLevel);
//        findEmployeeMoreThenMinSalaryLevel(minSalaryLevel);
//
//        int maxSalaryLevel = 150_000;
//        System.out.printf("\nСписок сотрудников с зарплатой меньше %d рублей:\n", maxSalaryLevel);
//        findEmployeeLessThenMinSalaryLevel(minSalaryLevel);
    }
}
