package by.homework.tasks.task7;

public class Student {
//1. Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет,
// тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).
// Инициализацию студента в классе main выполнять через конструктор с параметрами.
// Также определите конструктор без параметров.
     int id;
     String name;
     String surname;
     String faculty;
     int course;
     String group;
     int averageMark;

// конструктор с параметрами
    public Student(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }

// конструктор без параметров
    public Student() {
    }

//2.Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + averageMark);
        System.out.println("------------------------------");
    }

//3. Создать метод, который будет изменять текущую группу студента
   // (сам метод в качестве параметра будет принимать новую группу)
    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

//  4. Создать метод, который будет возвращать текущую группу студента
     public String currentGroup() {
        return group;
    }

//5. Создать метод, который будет изменять оценку студента и группу студента.
    public void updateMarkAndGroup(int newMark, String newGroup) {
        this.averageMark = newMark;
        this.group = newGroup;
    }

//7.  Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
// массив студентов у которых оценка выше переданной оценке в методе.
// (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
    public static Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student s : students) {
            if (s.averageMark > mark) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = 0;

        for (Student s : students) {
            if (s.averageMark > mark) {
                result[index++] = s;
            }
        }

        return result;
    }
}