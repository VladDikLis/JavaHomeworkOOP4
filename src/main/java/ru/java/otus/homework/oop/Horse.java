package ru.java.otus.homework.oop;

import java.util.Objects;

public class Horse implements Go {
    String name;
    Integer speed;
    Integer powerConsumption;
    Integer stamina;

    public Horse(String name, Integer speed, Integer powerConsumption, Integer stamina) {
        this.name = name;
        this.speed = speed;
        this.powerConsumption = powerConsumption;
        this.stamina = stamina;
    }


}