package by.homework.tasks.task13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//2. Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал. У группы: номер группы, коллекция студентов (List<Student> students) У факультета: наименование факультета, список групп (List<Group> groups. ) Реализовать во всех классах методы геттеры и сеттеры.

public class Group {
    private String groupNumber;
    private List<Student> students = new ArrayList<>();

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    //1 .4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);

    public void removeStudentsByMark(int mark) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAverageMark() < mark) {
                iterator.remove();
            }
        }
    }

    // 1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
        }
    }

    // 1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.
    public double calculateAverageGroupMark() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getAverageMark();
        }
        return sum / students.size();
    }

    @Override
    public String toString() {
        return "Group " + groupNumber + ": " + students;
    }
}
