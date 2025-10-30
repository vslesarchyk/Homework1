package by.homework.tasks.task14;

public class Main {

    public static void main(String[] args) {

//1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум. При этом попробуйте добавит двух пациентов, с одинаковыми полями. Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode. Палаты распределить по отделениям.

        Patient p1= new Patient(1,"Иван", "Иванов","Грипп", 25, Patient.Gender.MALE);
        Patient p2= new Patient(2,"Петр", "Иванов","Грипп", 35, Patient.Gender.MALE);
        Patient p3= new Patient(3,"Иван", "Петров","ОРВИ", 32, Patient.Gender.MALE);
        Patient p4= new Patient(4,"Анна", "Иванова","ОРВИ", 26, Patient.Gender.FEMALE);
        Patient p5= new Patient(5,"Мария", "Петрова","Грипп", 26, Patient.Gender.FEMALE);
        Patient p6= new Patient(6,"Анна", "Новая","ОРВИ", 26, Patient.Gender.FEMALE);
        Patient p7= new Patient(1,"Иван", "Иванов","Грипп", 25, Patient.Gender.MALE);

        Room room1 = new Room(1, Room.RoomType.MALE);
        Room room2 = new Room(2, Room.RoomType.FEMALE);

        room1.addPatient(p1);
        room1.addPatient(p2);
        room1.addPatient(p3);
        room2.addPatient(p4);
        room2.addPatient(p5);
        room2.addPatient(p6);
        room1.addPatient(p7);

        Department dept = new Department("Терапия");
        dept.addRoom(room1);
        dept.addRoom(room2);

        // Вывод информации
        dept.printDepartmentInfo();
        dept.countGenders();
    }
}


