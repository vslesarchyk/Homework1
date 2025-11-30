package by.homework.task18;

public class Main {

//1.1 Создать два потока (две машины которые будут ехать параллельно). Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.

    public static void main(String[] args) {
        runTwoCars();
        runThreeCarsWithJoin();
    }

    //1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep). Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки). В последствии поток будет спать переданное время.

        private static void runTwoCars() {
            Car car1 = new Car("BMW", "1234", 400);
            Car car2 = new Car("Audi", "4321", 500);

            car1.start();
            car2.start();
        }

    //1.3 Запустить три потока с машинами. При этом 2 машины начнут двигаться только после того, как 1 машина прекратит езду (прекратит выполнение потока) (метод join)
    private static void runThreeCarsWithJoin() {

        Car car1 = new Car("Toyota", "2222", 500);
        Car car2 = new Car("Mercedes", "3333", 400);
        Car car3 = new Car("Kia", "4444", 400);

        car1.start();

        try {
            car1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //стартуют только после car1
        car2.start();
        car3.start();
    }
}
