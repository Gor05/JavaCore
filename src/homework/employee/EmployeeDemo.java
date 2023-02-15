package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employeeID");
            System.out.println("Please input 4 for search employee by company name");
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for print only active employees");
            System.out.println("Please input 8 for inactive employee by id");
            System.out.println("Please input 9 for activate employee by id");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("employee was added");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword;
                    keyword = scanner.nextLine();
                    employeeStorage.searchByEmployeeID(keyword);
                    break;
                case "4":
                    System.out.println("Please input key");
                    String key = scanner.nextLine();
                    employeeStorage.searchByCompanyName(key);
                    break;
                case "5":
                    System.out.println("Please input salary");
                    String sallary;
                    sallary = scanner.nextLine();
                    employeeStorage.searchBySalary(sallary);
                    break;
                case "6":
                    String empid = scanner.nextLine();
                    System.out.println("New position");
                    String newPosition = scanner.nextLine();
                    employeeStorage.employeePosition(empid,newPosition);
                    break;
                case "7":
                    System.out.println("Only active employees");
                    employeeStorage.activeEmployee();
                    break;
                case "8":
                    System.out.println("Inactive");
                    String inactive;
                    inactive = scanner.nextLine();
                    employeeStorage.inactiveemployeeByID(inactive);
                    break;
                case "9":
                    String emp = scanner.nextLine();
                    employeeStorage.activateEmployee(emp);
                    break;
                default:
                    System.out.println("wrong command. Please try again");
            }
        }
    }
}

