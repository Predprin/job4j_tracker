package ru.job4j.oop;

import ru.job4j.oop.Vehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " идёт по рельсам");
    }
}
