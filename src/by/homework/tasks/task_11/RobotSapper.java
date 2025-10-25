package by.homework.tasks.task_11;

//РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
public class RobotSapper implements Robot, RobotEngineer {
    String model;
    int powerConsumption;
    String classisNumber;
    String material;
    boolean isOn;

    public RobotSapper(String model, int powerConsumption, String classisNumber, String material, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.classisNumber = classisNumber;
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
        System.out.println(model + " исследует местность");
    }
    @Override
    public void repairRobot(){
        System.out.println(model + " требует ремонт");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт приспособление для разминирования");
    }
}
