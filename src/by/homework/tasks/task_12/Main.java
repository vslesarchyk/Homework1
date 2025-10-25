package by.homework.tasks.task_12;

//1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", 150);
        Motorcycle moto = new Motorcycle("Moto", 50);

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motoGarage = new Garage<>(moto);

        System.out.println("Транспорт: " + carGarage.getVehicle().getName());
        System.out.println("Разрешён ли въезд? " + carGarage.isEntryPermitted());

        System.out.println("Транспорт: " + motoGarage.getVehicle().getName());
        System.out.println("Разрешён ли въезд? " + motoGarage.isEntryPermitted());
    }
}
