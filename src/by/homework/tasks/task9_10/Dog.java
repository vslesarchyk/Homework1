package by.homework.tasks.task9_10;


//В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать. При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    //добавление конструктора Dog
    public Dog(String name, String breed, double averageWeight, String color, int maxLifeSpan, String foodType) {
        super(color, maxLifeSpan, foodType); //вызов конструктора родительского класса Animal
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    //метод лаять
    public void bark() {
        System.out.println(name + " лает");
    }

    //метод кусать
    public void bite() {
        System.out.println(name + " кусает");
    }

    //метод бегать
    public void run() {
        System.out.println(name + " бегает");
    }

    //метод прыгать
    public void jump() {
        System.out.println(name + " прыгает");
    }

    //метод "Животное издаёт звук"
    @Override
    public void makeSound() {
        System.out.println(name + " издаёт звук");
    }

    //метод "Животное играет"
    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    @Override
    public String toString() {
        return "Собака: " + name + ", Порода: " + breed + ", Вес: " + averageWeight + " кг, " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if (name.equals(dog.getName())
                && breed.equals(dog.getBreed())
                && maxLifeSpan == (dog.getMaxLifeSpan())
                && foodType.equals(dog.getFoodType())
                && color.equals(dog.getColor())
                && averageWeight == (dog.getAverageWeight())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
         int result = name.hashCode() + breed.hashCode() + maxLifeSpan + foodType.hashCode() + color.hashCode() + Double.hashCode(averageWeight);
          return result;
    }
}


