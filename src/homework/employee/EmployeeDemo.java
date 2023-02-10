package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        Boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employeeID");
            System.out.println("Please input 4 for search employee by company name");

            String command = scanner.nextLine();
            switch (command) {
                case "0" :
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee");
                    String employee = scanner.nextLine();
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    Employee emp = new Employee(employee,name,surname);
                    employeeStorage.add(emp);
                    System.out.println("employee was added");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByEmployeeID(keyword);
                    break;
                case "4" :

                default:
                    System.out.println("wrong command. Please try again");
            }
        }
    }
}
