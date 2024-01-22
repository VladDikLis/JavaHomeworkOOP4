package ru.java.otus.homework.oop;

public class Human implements Go {
    String name;
    String transport;

    public Human(String name, String transport) {
        this.name = name;
        this.transport = transport;
    }

    public void humanTransport(String transport) {
        this.transport = transport;
    }

    @Override
    public Boolean go(Integer distance, String area) {
        System.out.println("Человек преодолел дистинцию.");
        return true;
    }
}