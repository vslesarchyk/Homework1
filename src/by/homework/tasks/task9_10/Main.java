package by.homework.tasks.task9_10;

public class Main {
   public static void main(String[] args) {
      Zoo zoo = new Zoo();
//1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы. (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.) 1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы (издание звуков, животное играет). У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)


    //(String name, String breed, double averageWeight, String color, int maxLifeSpan, String foodType)

      // 3 собаки
      Dog dog1 = new Dog("Рекс", "Овчарка", 28.0, "коричневый", 13, "мясо");
      Dog dog2 = new Dog("Собака", "Лабрадор", 28.5, "коричневый", 14, "мясо");
      Dog dog3 = new Dog("Шарик", "Дворняга", 20.0, "коричневый", 10, "мясо");

      // 3 птицы
      Bird bird1 = new Bird("Воробей", 150, "коричневый", 4, "насекомые");
      Bird bird2 = new Bird("Орел", 3000, "серый", 25, "мясо");
      Bird bird3 = new Bird("Ласточка", 500, "серый", 15, "насекомые");

      // Добавление животных в зоопарк
      zoo.addAnimal(dog1);
      zoo.addAnimal(dog2);
      zoo.addAnimal(dog3);
      zoo.addAnimal(bird1);
      zoo.addAnimal(bird2);
      zoo.addAnimal(bird3);

      // Получаем всех животных и вызываем методы
      Animal[] allAnimals = zoo.getAnimals();

      for (Animal animal : allAnimals) {
         System.out.println(animal);
         animal.makeSound();
         animal.play();
         System.out.println("-------------------------------------------");
      }

      // equals и hashCode
      System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));
      System.out.println("bird1.equals(bird3): " + bird1.equals(bird3));
      System.out.println("dog1.hashCode(): " + dog1.hashCode());
      System.out.println("bird1.hashCode(): " + bird1.hashCode());
   }
}
