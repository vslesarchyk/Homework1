package by.homework.tasks.task15;

import java.util.Objects;

//1.1.Создать класс. Сотрудник.
//1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(int id, String firstName, String lastName, int age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Employee employee =(Employee) o;
        if (firstName.equals(employee.getFirstName())
        &&lastName.equals(employee.getLastName())
        &&age==(employee.getAge())
        &&salary == (employee.getSalary())
        &&id==(employee.getId())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (firstName.hashCode() + lastName.hashCode() + age + salary + id);
    }
}
