package medicalCentre;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Patient {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM/yyyy HH:m:s");
    private String id;
    private String name;
    private String surname;
    private String phone;
    private String doctor;
    private Date birth;
    private Date reg;

    public Patient(String id, String name, String surname, String phone, String doctor, Date birth, Date reg) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.doctor = doctor;
        this.birth = birth;
        this.reg = reg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getReg() {
        return reg;
    }

    public void setReg(Date reg) {
        this.reg = reg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(phone, patient.phone) && Objects.equals(doctor, patient.doctor) && Objects.equals(birth, patient.birth) && Objects.equals(reg, patient.reg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phone, doctor, birth, reg);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", doctor='" + doctor + '\'' +
                ", birth=" + sdf.format(birth) +
                ", reg=" + sd2.format(reg) +
                '}';
    }
}
