package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle boeing = new Plane();
        Vehicle ssj = new Plane();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle[] vehicles = new Vehicle[] {boeing, ssj, train1, train2, bus1, bus2};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
