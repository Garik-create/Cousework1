public class CourseWork1 {
    static Employee[] employee = new Employee[10];
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
            if (employee[i] != null) {
                if (employee[i].getEmployeeSalary() > maxEmployeeSalary) {
                    maxEmployeeSalary = employee[i].getEmployeeSalary();
                    j = i;
                }
            }
        }
        return employee[j];
    }

    private static Employee findMinSalaryEmployee() {
        int minEmployeeSalary = countSumSalaries();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getEmployeeSalary() < minEmployeeSalary) {
                    minEmployeeSalary = employee[i].getEmployeeSalary();
                    j = i;
                }
            }
        }
        return employee[j];
    }

    private static void printEmployeeList() {

        for (Employee employee : employee) {

            if (employee != null) {
                System.out.println(employee + "\n");
            }
        }
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

    //    static int count = 0;
    static int id = 0;
    public static int getId(){
        id++;

        return id;
    }

    public static void main(String[] args) {


//        Employee employee1 = ;
//        Employee employee2 = ;
//        Employee employee3 = ;
//        Employee employee4 = ;
//        Employee employee5 = ;

        employee[0] = new Employee("Иванов Иван Иванович", 5, 50_000, getId());
        employee[1] = new Employee("Петров Пётр Петрович", 4, 100_000, getId());
        employee[2] = new Employee("Сидоров Сидр Сидорович", 3, 150_000, getId());
        employee[3] = new Employee("Фёдоров Фёдор Фёдорович", 2, 200_000, getId());
        employee[4] = new Employee("Степанов Степан Степанович", 1, 250_000, getId());


        printEmployeeList();
        System.out.println("Сумма затрат на зарплаты сотрудников = " + countSumSalaries() + " рублей в месяц");
        System.out.println("\nСотрудник с минимальной зарплатой\n" + findMinSalaryEmployee());
        System.out.println("\nСотрудник с максимальной зарплатой\n" + findMaxSalaryEmployee());
        System.out.println("Средняя зарплата сотрудников - " + countAverageSalary() + " рублей в месяц");
        printCredentialsEmployees();
    }
}
