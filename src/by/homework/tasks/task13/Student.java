package by.homework.tasks.task13;

//2. Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал. У группы: номер группы, коллекция студентов (List<Student> students) У факультета: наименование факультета, список групп (List<Group> groups. ) Реализовать во всех классах методы геттеры и сеттеры.

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String cityOfBirth;
    private double averageMark;

    public Student(String firstName, String lastName, String birthDate, String cityOfBirth, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cityOfBirth = cityOfBirth;
        this.averageMark = averageMark;
    }

     public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public String getCityOfBirth() { return cityOfBirth; }
    public void setCityOfBirth(String cityOfBirth) { this.cityOfBirth = cityOfBirth; }

    public double getAverageMark() { return averageMark; }
    public void setAverageMark(double averageMark) { this.averageMark = averageMark; }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + averageMark + ")";
    }
}
