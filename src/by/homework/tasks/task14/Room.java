package by.homework.tasks.task14;

import java.util.HashSet;
import java.util.Set;

//1. Создать класс пациент, палата, отделение.
//1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
public class Room {
    private int number;
    private RoomType type;
    private Set<Patient> patients = new HashSet<>();
    private int MAX_PATIENTS = 3;

    public Room(int number, RoomType roomType) {
    }

    enum RoomType {
        MALE,
        FEMALE;

    }

    public Room(int number, RoomType type, Set<Patient> patients) {
        this.number = number;
        this.type = type;
        this.patients = patients;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type=" + type +
                ", patients=" + patients +
                '}';
    }

    //1.6 Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.

    public boolean addPatient(Patient p) {
        if (patients.size() >= 3) {
            System.out.println("Палата №" + number + " переполнена!");
            return false;
        }

        if ((type == RoomType.MALE && p.getGender() != Patient.Gender.MALE)
                || (type == RoomType.FEMALE && p.getGender() != Patient.Gender.FEMALE)) {
            System.out.println("Пациент " + p + " не подходит по полу в палату №" + number);
            return false;
        }
        if (!patients.isEmpty()) {
            String existingDiagnosis = patients.iterator().next().getDiagnosis();
            if (!existingDiagnosis.equalsIgnoreCase(p.getDiagnosis())) {
                System.out.println("Пациент " + p + " имеет другой диагноз (" + p.getDiagnosis() + ")");
                return false;
            }
        }

        return patients.add(p);
    }
    // 1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
    public void printPatients() {
        System.out.println("Палата №" + number + " (" + type + "), диагноз: " +
                (patients.isEmpty() ? "нет пациентов" : patients.iterator().next().getDiagnosis()));
        for (Patient p : patients) {
            System.out.println("   - " + p);
        }
    }
}



