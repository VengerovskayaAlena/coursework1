public class Main {


    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Петров Пётр Петрович", 1, 80000);
        employees[1] = new Employee("Михайлов Михаил Михайлович", 4, 60500);
        employees[2] = new Employee("Самойлова Екатерива Викторовна", 3, 50500);
        employees[3] = new Employee("Наумов Семён Николаевич", 3, 55000);

        print();
        System.out.println( "Сумма зарплат сотрудников: " + sumSalary());
        System.out.println( "Сотрудник с минимальной зп: " + findEmployeeMinSalary());
        System.out.println( "Сотрудник с максимальной зп: " + findEmployeeMaxSalary());
        System.out.println( "Средняя зп: " + averageSalary());
        printNames();
    }

    private static void print() {
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }

    private static int sumSalary(){
        int sum = 0;
        for (Employee employee:employees){
           sum+=employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeMinSalary(){
        Employee employeeMinSalary = null;
        for (Employee employee:employees){
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()){
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static Employee findEmployeeMaxSalary(){
        Employee employeeMaxSalary = null;
        for (Employee employee:employees){
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()){
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double averageSalary(){
        return (double) sumSalary() / employees.length;
    }

    private static void printNames() {
        for (Employee employee:employees){
            System.out.println(employee.getName());
        }
    }
}
