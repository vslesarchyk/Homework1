package by.homework.tasks.task15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //1.3.Создать сотрудников (создайте штук восемь)
        Employee employee1 = new Employee(1, "Иван", "Иванов", 25, 2000);
        Employee employee2 = new Employee(2, "Петр", "Петров", 26, 2500);
        Employee employee3 = new Employee(3, "Сергей", "Сергеев", 28, 2600);
        Employee employee4 = new Employee(4, "Дмитрий", "Дмитриев", 30, 3000);
        Employee employee5 = new Employee(5, "Анна", "Аннова", 31, 3500);
        Employee employee6 = new Employee(6, "Мария", "Иванова", 27, 5000);
        Employee employee7 = new Employee(7, "Елена", "Новая", 28, 4700);
        Employee employee8 = new Employee(8, "Анастасия", "Петрова", 29, 3200);


        //1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.
        Map<Employee, String> employees = new HashMap<>();
        employees.put(employee1, "Тестировщик");
        employees.put(employee2, "Разработчик");
        employees.put(employee3, "Плотник");
        employees.put(employee4, "Дизайнер");
        employees.put(employee5, "Аналитик");
        employees.put(employee6, "Тестировщик");
        employees.put(employee7, "Плотник");
        employees.put(employee8, "Менеджер");

        raiseSalaryForProfession(employees, "Плотник", 200);
        employees.forEach((emp, prof) ->
                System.out.println(prof + emp));
    }

//1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии. Сигнатура метода к примеру такая.
//private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease). Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet)

    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(profession)) {
                Employee emp = entry.getKey();
                emp.setSalary(emp.getSalary() + amountOfIncrease);
            }
        }
    }
}