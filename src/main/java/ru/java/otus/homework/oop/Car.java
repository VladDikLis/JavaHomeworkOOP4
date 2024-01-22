package ru.java.otus.homework.oop;

import java.util.Objects;

public class Car implements Go {
        String name;
        Integer speed;
        Integer powerConsumption;
        Integer stamina;

        public Car(String name, Integer speed, Integer powerConsumption, Integer stamina) {
            this.name = name;
            this.speed = speed;
            this.powerConsumption = powerConsumption;
            this.stamina = stamina;
        }

        @Override
        public Boolean go(Integer distance, String area) {
            if (!Objects.equals(area, "PLAIN")) {
                System.out.println("Машина не смогла преодолеть дистанцию. Нельзя проехать по такой местности.");
                return false;
            }
            int i = 0;
            while (distance > i) {
                i += speed;
                stamina -= powerConsumption;
                if (stamina < 0) {
                    System.out.println("Машина не смогла преодолеть дистанцию. Кончился бензин.");
                    return false;
                }
            }
            if (stamina >= 0) {
                System.out.println("Машина преодолела дистинцию.");
            }
            return true;
        }
    }