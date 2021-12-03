package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Поездка на автобусе");
    }

    @Override
    public void passengers(int count) {
        if (count < 50) {
            System.out.println("Для всех пассажиров хватает сидячих мест.");
        } else {
            System.out.println("Кому то приходиться стоять");
        }
    }

    @Override
    public double refuel(int litre) {
        return litre * 45.80;
    }
}
