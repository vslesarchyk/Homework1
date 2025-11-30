package by.homework.task19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        first();
        second();
    }

//1.1 На основании этого интерфейса создать лямбда выражение, которое будет возвращать строку с большими буквами.

    public static void first() {
        StringProcessor toUpper = string -> string.toUpperCase();
        System.out.println(toUpper.process("hello world"));
    }

    public static void second() {

//1.1. Создать города
        City city1 = new City(1, "London", 8000000, Continent.EUROPE);
        City city2 = new City(2, "Tokyo", 9000000, Continent.ASIA);
        City city3 = new City(3, "Kyoto", 6000000, Continent.ASIA);
        City city4 = new City(4, "Sydney", 5500000, Continent.AUSTRALIA);
        City city5 = new City(5, "New York", 8500000, Continent.NORTH_AMERICA);
        City city6 = new City(6, "Lagos", 13000000, Continent.AFRICA);
        List<City> cities = List.of(city1, city2, city3, city4, city5, city6);

        //1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)

        City maxAsia = cities.stream().filter(city -> city.getContinent() == Continent.ASIA).max(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println("Густонаселенный город в Азии: " + maxAsia);

//1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
        City minAsia = cities.stream().filter(city -> city.getContinent() == Continent.ASIA).min(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println("Город в Азии с минимальным населением: " + minAsia);

//1.4. Найти самый густонаселённый город (max)

        City allCitiesmax = cities.stream().max(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println("Самый густонаселённый город: " + allCitiesmax);

//1.5. Найти город с самым маленьким населением. (min)

        City allCitiesmin = cities.stream().min(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println("Город с самым маленьким населением: " + allCitiesmin);

        //1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).

        City first1M = cities.stream().filter(city -> city.getPopulation() > 1000000).findFirst().orElse(null);
        System.out.println("Первый город с населением>1 млн: " + first1M);

//1.7. Отобрать города с населением больше 1 млн. (filter)

        List<City> over1Mpopulation = cities.stream().filter(city->city.getPopulation() > 1000000).toList();
        System.out.println("Города с населением больше 1 млн. " + over1Mpopulation);

//1.8. Создать коллекцию из названий городов, на основании объектов (map)
        List<String> cityNames = cities.stream().map(City::getName).toList();
        System.out.println("Названия городов: " + cityNames);
    }
}
