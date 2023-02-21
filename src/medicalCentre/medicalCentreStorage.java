package medicalCentre;


public class medicalCentreStorage {
    private Doctor[] array = new Doctor[10];
    private int size = 0;

    public void add(Doctor value) {
        size++;
        if (size == array.length) {
            extend();
        }
        array[size - 1] = value;
    }

    private void extend() {
        Doctor[] Array = new Doctor[array.length + 10];
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


}
