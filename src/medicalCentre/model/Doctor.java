package medicalCentre.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Doctor {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM/yyyy HH:m:s");
    private String id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String profession;
    private Date birth;
    private Date reg;
    private Doctor doc;


    public Doctor(String id, String name, String surname, String email, String phoneNumber, String profession, Date birth, Date reg,Doctor doc) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.birth = birth;
        this.reg = reg;
        this.doc = doc;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public SimpleDateFormat getSd2() {
        return sd2;
    }

    public void setSd2(SimpleDateFormat sd2) {
        this.sd2 = sd2;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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

    public void setDoctor(Doctor doc) {
        this.doc = doc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(id, doctor.id) && Objects.equals(name, doctor.name) && Objects.equals(surname, doctor.surname) && Objects.equals(email, doctor.email) && Objects.equals(phoneNumber, doctor.phoneNumber) && Objects.equals(profession, doctor.profession) && Objects.equals(birth, doctor.birth) && Objects.equals(reg, doctor.reg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, phoneNumber, profession, birth, reg);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "sdf=" + sdf +
                ", sd2=" + sd2 +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profession='" + profession + '\'' +
                ", birth=" + sdf.format(birth) +
                ", reg=" + sd2.format(reg) +
                ", doc=" + doc +
                '}';
    }
}