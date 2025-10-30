package by.homework.tasks.task14;

import java.util.HashSet;
import java.util.Set;

//1. Создать класс пациент, палата, отделение.
//1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
public class Department {
        private String name;
        private Set<Room> rooms = new HashSet<>();

        public Department(String name) {
                this.name = name;
                this.rooms = rooms;
        }

        public String getName() {
                return name;
        }

        public Set<Room> getRooms() {
                return rooms;
        }
        public void addRoom (Room room) {
                rooms.add(room);
}

        @Override
        public String toString() {
                return "Department{" +
                        "name='" + name + '\'' +
                        ", rooms=" + rooms +
                        '}';
        }

//1.5 Посчитать количество мужчин и женщин в отделении.
        public void countGenders() {
                long men = 0;
                long women = 0;
                for (Room w : rooms) {
                        for (Patient p : w.getPatients()) {
                                if (p.getGender() == Patient.Gender.MALE) men++;
                                else women++;
                        }
                }
                System.out.println("мужчин — " + men + ", женщин — " + women);
        }
        public void printDepartmentInfo() {
                System.out.println("Отделение: " + name);
                for (Room w : rooms) {
                        w.printPatients();
                }
        }
}





