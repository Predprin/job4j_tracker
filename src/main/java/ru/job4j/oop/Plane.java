package ru.job4j.oop;

import ru.job4j.oop.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит по воздуху.");
    }
}
