package by.homework.tasks.task9_10;

//Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов. При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).

import java.util.Objects;

public class Bird extends Animal {
    private String family;
    private int maxFlightHeight;

//Добавление конструктора Bird
    public Bird(String family, int maxFlightHeight, String color, int maxLifeSpan, String foodType) {
        super(color, maxLifeSpan, foodType); //вызов конструктора родительского класса Animal
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

//метод петь
    public void sing() {
        System.out.println(family + " поёт");
    }

//метод клевать
    public void peck() {
        System.out.println(family + " клюёт");
    }

    public void incubate() {
        System.out.println(family + " высиживает птенцов");
    }

    //метод "Животное издаёт звук"
    @Override
    public void makeSound() {
        System.out.println(family + " издает звук");
    }
    //метод "Животное играет"
    @Override
    public void play() {
        System.out.println(family + " играет");
    }

//1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    @Override
    public String toString() {
        return "Птица: " + family + ", Макс. высота полёта: " + maxFlightHeight + " м, " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bird)) return false;
        Bird bird = (Bird) obj;
        return maxFlightHeight == bird.maxFlightHeight &&
                Objects.equals(family, bird.family) &&
                Objects.equals(color, bird.color) &&
                maxLifeSpan == bird.maxLifeSpan &&
                Objects.equals(foodType, bird.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, maxFlightHeight, color, maxLifeSpan, foodType);
    }
}
