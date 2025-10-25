package by.homework.tasks.task_11;

//1.1 Создать классы роботов.
//РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
public class RobotCooker implements Robot {
    String model;
    int powerConsumption;
    String country;
    String cookingUnit;
    boolean isOn;

    public RobotCooker(String model, int powerConsumption, String country, String cookingUnit, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    //Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.
    //В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)

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
         System.out.println(model + " готовит еду");
     }

}
