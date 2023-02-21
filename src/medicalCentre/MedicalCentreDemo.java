package medicalCentre;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MedicalCentreDemo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        medicalCentreStorage mcs = new medicalCentreStorage();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birth;

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add docor");
            System.out.println("Please input 2 for search doctor by profession");
            System.out.println("Please input 3 for delete doctor by id");
            System.out.println("Please input 4 for change doctor data by id");
            System.out.println("Please input 5 add patient");
            System.out.println("Please input 6 for print all patients by doctor");
            System.out.println("Please input 7 print today patients");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    Date reg = new Date();

                    System.out.println("Please input id");
                    String id = scanner.nextLine();
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input email");
                    String email = scanner.nextLine();
                    System.out.println("Please input phoneNumber");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Please input profession");
                    String profession = scanner.nextLine();
                    System.out.println("Please input date");
                    String date = scanner.nextLine();
                    birth = sdf.parse(date);
                    Doctor doctor = new Doctor(id,name,surname,email,phoneNumber,profession,birth,reg);
                    mcs.add(doctor);
                    System.out.println("Doctor was added");
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    mcs.print();
                    break;
                case "7":

                    break;
                default:
                    System.out.println("wrong command. Please try again");
            }
        }
    }
}
