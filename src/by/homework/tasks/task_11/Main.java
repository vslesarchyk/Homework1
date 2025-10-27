package by.homework.tasks.task_11;

//В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремантировать робота (результаты выполнения методы выведите в консоль)
public class Main {
    public static void main(String[] args) {
    RobotCooker cooker = new RobotCooker("Повар1", 400, "Италия", "плита", false);
   //(String model, int powerConsumption, String country, String cookingUnit, boolean isOn)
   RobotBuilder builder = new RobotBuilder("Строитель1", 400, "Испания", "сталь", false);
   //(String model, int powerConsumption, String country, String material, boolean isOn)
   RobotSapper sapper = new RobotSapper("Сапер1", 300, "AB1", "чугун",false );
   //(String model, int powerConsumption, String classisNumber, String material, boolean isOn)

        cooker.repairRobot();
        builder.repairRobot();
        sapper.repairRobot();

 //1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn.
        System.out.println( " Включение ");
        cooker.turnOn();
        builder.turnOn();
        sapper.turnOn();


//1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)
        System.out.println( " uniquePossibility ");
        cooker.uniquePossibility();
        builder.uniquePossibility();
        sapper.uniquePossibility();


//Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
//Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.

   Robot[] allRobots = { cooker, sapper, builder }; // все виды роботов (робот-повар, робот сапёр, робот строитель)
   RobotEngineer[]  engineerRobots = { sapper,builder };
   RobotSapper [] robotSappers = { sapper };

    System.out.println("-------------Все роботы демонстрируют способности");
    for (Robot robot : allRobots) {
    robot.uniquePossibility();
}

 System.out.println("-------------Cпособности роботов-инженеров");
    for (RobotEngineer engineer : engineerRobots) {
        engineer.createItem();
    }

    }

    }

