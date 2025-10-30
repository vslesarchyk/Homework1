package by.homework.tasks.task13;

public class Main {
    public static void main(String[] args) {
        // 1.1. Создать несколько студентов.
        Student s1 = new Student("Иван", "Иванов", "2002-01-01", "Минск", 8.0);
        Student s2 = new Student("Петр", "Петров", "2005-04-12", "Гродно", 7.5);
        Student s3 = new Student("Анна", "Сидорова", "2003-03-20", "Брест", 9.8);
        Student s4 = new Student("Елена", "Петрова", "2002-11-15", "Витебск", 8.9);

        // 1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
        Group g1 = new Group("1");
        Group g2 = new Group("2");


        g1.addStudent(s1);
        g1.addStudent(s2);
        g2.addStudent(s3);
        g2.addStudent(s4);

        // 1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
        Faculty f1 = new Faculty("Факультет");
        f1.addGroup(g1);
        f1.addGroup(g2);

        System.out.println("До удаления студентов");
        System.out.println(f1);

        // 1.4 Удаление студентов с низким баллом
        g2.removeStudentsByMark(9);
        g1.removeStudentsByMark(8);

        System.out.println("После удаления студентов с низким баллом");
        System.out.println(f1);

        // 1.5 Переводим студентов, если в группе меньше 2
        g2.transferToGroup(g1);

        System.out.println("После перевода студентов");
        System.out.println(f1);

        // 1.6 Средний балл по группе
        System.out.println("Средний балл группы " + g1.getGroupNumber() + ": " + g1.calculateAverageGroupMark());
    }
}
