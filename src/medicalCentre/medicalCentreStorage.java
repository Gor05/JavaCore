package medicalCentre;


import medicalCentre.model.Doctor;
import medicalCentre.model.Patient;

public class medicalCentreStorage {
    private Doctor[] array = new Doctor[10];
    private Patient[] mass = new Patient[10];
    private int size = 0;
    private int size1 = 0;

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
    public void add(Patient value) {
        size++;
        if (size == array.length) {
            extend();
        }
        mass[size1 - 1] = value;
    }

    private void extend1() {
        Patient[] Array = new Patient[mass.length + 10];
        for (int i = 0; i < array.length; i++) {
            Array[i] = mass[i];
        }
        mass = Array;

    }

    public void print1() {
        for (int i = 0; i < size; i++) {
            System.out.println(mass[i] + " ");
        }
    }
    public  void searchDoctorByProfession(String pro){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Doctor doctor = array[i];
            if (doctor.getProfession().contains(pro)){
                found = true;
                System.out.println(doctor);
            }
        }
        if (!found){
            System.out.println( pro + " not found" );

        }
    }

    public  void deleteDoctorByid(String rem){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Doctor doctor = array[i];
            if (doctor.getId().contains(rem)){
                found = true;
                System.out.println(false);
            }
        }
        if (!found){
            System.out.println( rem + " not found" );

        }
    }
    public void doctordata(String ddb, String newData){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Doctor doctor = array[i];
            if (doctor.getId().equals(ddb)){
                found = true;
                doctor.setId(newData);
            }
        }
        if (!found){
            System.out.println(" not found" );

        }
    }
    public void allPatientsBydoctor(String al){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Doctor doctor = array[i];
            if (doctor.getId().contains(al)){
                found = true;
                System.out.println(al);
            }
        }
        if (!found){
            System.out.println(" not found" );

        }
    }


}
