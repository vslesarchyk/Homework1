package by.homework.task17;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int maxSpeed;
    private String country;

    public Car(String brand, int maxSpeed, String country) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        if (brand.equals(car.getBrand()) && maxSpeed == (car.getMaxSpeed()) && country.equals(car.getCountry())) {
            return true;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + maxSpeed + country.hashCode();
    }
}