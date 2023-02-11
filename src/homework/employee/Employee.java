package homework.employee;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private String company;

    public Employee(String name, String surname, String employeeID, String company) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.company = company;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
