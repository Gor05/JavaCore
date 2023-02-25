package medicalCentre.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Patient {

    private String Id;
    private String Name;
    private String Surname;
    private String Phone;
    private String Doctor;


    public Patient(String id, String name, String surname, String phone, String doctor) {
        Id = id;
        Name = name;
        Surname = surname;
        Phone = phone;
        Doctor = doctor;

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(Id, patient.Id) && Objects.equals(Name, patient.Name) && Objects.equals(Surname, patient.Surname) && Objects.equals(Phone, patient.Phone) && Objects.equals(Doctor, patient.Doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, Surname, Phone, Doctor);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Doctor='" + Doctor + '\'' +
                '}';
    }
}
