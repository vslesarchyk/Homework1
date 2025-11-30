package by.homework.task18.runnable;

import by.homework.task18.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "1234", 400);
        Car car2 = new Car("Audi", "4321", 500);

        Thread carThread1 = new Thread(car1);
        Thread carThread2 = new Thread(car2);

        carThread1.start();
        carThread2.start();
    }
}
