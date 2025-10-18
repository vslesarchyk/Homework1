package by.homework.tasks.task9_10;

//1.Создать классы: Животное, Собака, Птица. .Определить методы в классе животное: (издание звуков, животное играет)  Использовать наследование, где суперкласс-Животное. Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет) в классах Собака и Птица.


//Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения)
public class Animal {
    protected String color;
    protected int maxLifeSpan;
    protected String foodType;

//добавление конструктора Animal
    public Animal(String color, int maxLifeSpan, String foodType) {
        this.color = color;
        this.maxLifeSpan = maxLifeSpan;
        this.foodType = foodType;
    }

    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }

    public void play() {
        System.out.println("Животное играет");
    }

//1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    @Override
    public String toString() {
        return "Окрас: " + color + ", Макс. продолжительность жизни: " + maxLifeSpan + " лет, Тип питания: " + foodType;
    }
}