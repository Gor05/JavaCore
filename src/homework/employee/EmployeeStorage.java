package homework.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        size++;
        if (size == array.length) {
            extend();
        }
        array[size - 1] = value;
    }

    private void extend() {
        Employee[] Array = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            Array[i] = array[i];
        }
        array = Array;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void searchByEmployeeID(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employe = array[i];
            if (employe.getName().contains(keyword)){
                found = true;
                System.out.println(employe);
            }
        }
        if (!found){
            System.out.println("Book with " + keyword + " not found" );

        }
    }
}
