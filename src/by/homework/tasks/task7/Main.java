package by.homework.tasks.task7;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Иван", "Иванов", "Филологический", 2, "АВ1", 10);
        students[1] = new Student(2, "Петр", "Петров", "Химический", 1, "ВВ2", 7);
        students[2] = new Student(3, "Иван", "Сидоров", "Математический", 1, "ВВ3", 8);
        students[3] = new Student(4, "Елена", "Кузнецова", "Химический", 3, "ВВ4", 9);
        students[4] = new Student(5, "Игорь", "Смирнов", "Филологический", 4, "ВВ5", 6);


        Student[] goodStudents = Student.getStudents(students,  8);
        System.out.println("Студенты с оценкой выше 8:");
        for (Student s : goodStudents) {
            s.info();
        }
    }
}