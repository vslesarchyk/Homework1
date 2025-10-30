package by.homework.tasks.task14;

import java.util.Objects;

//1. Создать класс пациент, палата, отделение.
//1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
public class Patient {

    private int id;
    private String firstName;
    private String lastName;
    private String diagnosis;
    private int age;
    private Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }

    public Patient(int id, String firstName, String lastName, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        Patient patient = (Patient) o;
        if (id==(patient.getId())
                &&firstName.equals(patient.getFirstName())
                &&lastName.equals(patient.getLastName())
                &&diagnosis.equals(patient.getDiagnosis())
                &&age==(patient.getAge())
                &&gender.equals(patient.getGender())){
            return true;
        }
        return true;
    }

    @Override
        public int hashCode() {
            int result = id + firstName.hashCode() + lastName.hashCode() + diagnosis.hashCode()+ age + gender.hashCode();
            return result;
        }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}



