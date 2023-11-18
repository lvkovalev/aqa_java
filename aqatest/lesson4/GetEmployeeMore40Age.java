package aqatest.lesson4;

public class GetEmployeeMore40Age {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Kozlov Petr", "Team Leader", "kozlov@google.com", "375442332233", 50000, 31);
        employees[1] = new Employee("Rozkov Ivan ", "Tester", "rozkov@google.com", "375295758483", 30000, 42);
        employees[2] = new Employee("Koshkina Nadya", "Project Manager", "koshkina@google.com", "375294536543", 35000, 29);
        employees[3] = new Employee("Lapuhin Fedor", "Software Developer", "lapuhin@google.com", "375296673666", 60000, 51);
        employees[4] = new Employee("Nefodov Ilya", "Network Administrator", "nefodov@google.com", "375442334444", 40000, 36);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.displayInfo();
                System.out.println();
            }
        }
    }
}
