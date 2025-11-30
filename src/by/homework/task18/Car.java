package by.homework.task18;

//1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).

public class Car extends Thread {
    private String name;
    private String number;
    private int stopTime;

    public Car(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    private void drive() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(stopTime);
            System.out.println("Авто " + name + " " + number + " едет");
            System.out.println("Авто " + name + " " + number + " завершила движение");
        }
    }

    @Override
    public void run() {
        try {
            drive();
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
