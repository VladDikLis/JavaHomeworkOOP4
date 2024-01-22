package ru.java.otus.homework.oop;

import ru.java.otus.homework.oop.Go;

import java.util.Objects;

public class Bicycle implements Go {
    String name;

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public Boolean go(Integer distance, String area) {
        if (Objects.equals(area, "SWAMP")) {
            System.out.println("Велосипед не смог преодолеть дистанцию. Нельзя проехать по такой местности.");
            return false;
        }
        System.out.println("Велосипед преодолел дистинцию.");
        return true;
    }
}
