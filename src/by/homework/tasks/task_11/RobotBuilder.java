package by.homework.tasks.task_11;

//РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
public class RobotBuilder implements Robot, RobotEngineer {
    String model;
    int powerConsumption;
    String country;
    String material;
    boolean isOn;

    public RobotBuilder(String model, int powerConsumption, String country, String material, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.material = material;
        this.isOn = isOn;
    }

    // //Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.
//    //В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)

    @Override
    public void turnOn() {
        isOn=false;
        System.out.println(model + " включен");
    }
    @Override
    public void turnOff() {
        isOn=false;
        System.out.println(model + " выключен");
    }
    @Override
    public void uniquePossibility() {
        System.out.println(model + " строит здания");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт бетон");
    }
}
