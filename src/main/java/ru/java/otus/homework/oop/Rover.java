package ru.java.otus.homework.oop;

import java.util.Objects;

public class Rover implements Go {
    String name;
    Integer speed;
    Integer powerConsumption;
    Integer stamina;

    public Rover(String name, Integer speed, Integer powerConsumption, Integer stamina) {
        this.name = name;
        this.speed = speed;
        this.powerConsumption = powerConsumption;
        this.stamina = stamina;
    }

    @Override
    public Boolean go(Integer distance, String area) {
        int i = 0;
        while (distance > i) {
            i += speed;
            stamina -= powerConsumption;
            if (stamina < 0) {
                System.out.println("Внедорожник не смог преодолеть дистанцию. Кончился бензин.");
                return false;
            }
        }
        if (stamina >= 0) {
            System.out.println("Внедорожник преодолел дистинцию.");
        }
        return true;
    }
}
