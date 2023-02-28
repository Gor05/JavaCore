package medicalCentre;

import medicalCentre.model.Doctor;
import medicalCentre.model.Patient;
import medicalCentre.storage.PersonStorage;
import medicalCentre.util.DateUtil;

import java.util.Date;
import java.util.Scanner;

public class MedicalCentreDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private  static PersonStorage personStorage = new PersonStorage();
    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun){
          Commands.printCommands();
       String command = scanner.nextLine();
       switch (command){
           case  EXIT :
               isRun = false;
               break;
           case  ADD_DOCTOR:
                addDoctor();
               break;
           case  SEARCH_DOCTOR_BY_PROFESSION:
               searchDoctorByProfession();
               break;
           case  DELETE_DOCTOR_BY_ID:
               deleteDoctorById();
               break;
           case  CHANGE_DOCTOR_BY_ID:
               changeDoctorById();
               break;
           case  ADD_PATIENT:
               addPatient();
               break;
           case  PTINT_ALL_PATIENTS_BY_DOCTOR:
               printAllPatientsByDoctor();
               break;
           case  PRINT_TODAYS_PATIENTS:
               personStorage.printTodaysPatients();
               break;
           default:
               System.out.println("Wrong command");
       }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if(doctorById != null){
            personStorage.printAllPatientsByDoctor(doctorById);
        }else {
            System.out.println("doctor with" + doctorId + "does not exists");
        }
    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if(doctorById != null){
            System.out.println("Please input,id,name,surname,phone,registerDateTime(12/02/2023)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            Patient patient = new Patient();
            doctorById.setName(patientData[0]);
            doctorById.setSurname(patientData[1]);
            doctorById.setEmail(patientData[2]);
            doctorById.setProfession(patientData[3]);
            doctorById.setName(patientData[4]);


        }else {
            System.out.println("doctor with" + doctorId + "does not exists");
        }
    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if(doctorById != null){
            System.out.println("Please input id,name,surname,phone,email,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setEmail(doctorData[2]);
            doctorById.setProfession(doctorData[3]);
            doctorById.setName(doctorData[4]);
            System.out.println("Doctor changed");
        }else {
            System.out.println("doctor with" + doctorId + "does not exists");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if(doctorById != null){
             personStorage.deleteDoctorById(doctorId);
        }else {
            System.out.println("doctor with" + doctorId + "does not exists");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname,phone,email,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
       Doctor doctorById =  personStorage.getDoctorById(doctorId);
       if (doctorById == null){
          Doctor doctor = new Doctor();
          doctor.setId(doctorId);
          doctor.setName(doctorData[1]);
           doctor.setSurname(doctorData[2]);
           doctor.setEmail(doctorData[3]);
           doctor.setProfession(doctorData[4]);
           doctor.setName(doctorData[5]);
           personStorage.add(doctor);
           System.out.println("Doctor added");
       }else{
           System.out.println("doctor with" + doctorId + "already exsists");
       }
    }
}
