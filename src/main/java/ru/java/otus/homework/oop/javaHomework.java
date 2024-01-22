package ru.java.otus.homework.oop;

import java.util.Objects;

public class javaHomework {
    public static void main(String[] args) {

        Car car = new Car("Машина", 12, 1, 20);
        Rover rover = new Rover("Внедорожник", 8, 1, 30);
        Horse horse = new Horse("Лошадь", 5, 1, 20);
        Bicycle bicycle = new Bicycle("Велосипед");

        Human human1 = new Human("Петька", "Нет");
        Integer distance = 100;
        String area = String.valueOf(Area.SWAMP);

        human1.humanTransport("Лошадь");

        if (Objects.equals(human1.transport, "Нет")) {
            human1.go(distance, area);
            return;
        }
        if (Objects.equals(human1.transport, "Велосипед")) {
            bicycle.go(distance, area);
            return;
        }
        if (Objects.equals(human1.transport, "Лошадь")) {
            horse.go(distance, area);
            return;
        }
        if (Objects.equals(human1.transport, "Машина")) {
            car.go(distance, area);
            return;
        }
        if (Objects.equals(human1.transport, "Внедорожник")) {
            rover.go(distance, area);
        }
    }
}