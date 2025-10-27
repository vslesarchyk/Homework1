package by.homework.tasks.task_12;

//1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
public class Vehicle {
    private String name;
    private int emissions;

    public String getName() {
        return name;
    }


//1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle

    public int getEmissions() {
        return emissions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }

    public Vehicle(String name, int emissions) {
        this.name = name;
        this.emissions = emissions;

    }
}
