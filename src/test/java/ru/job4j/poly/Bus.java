package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int count) {
        if (count < 50) {
            System.out.println("ДЛя всех пассажиров хватает сидячих мест.");
        } else {
            System.out.println("Кому то приходиться стоять");
        }
    }

    @Override
    public double refuel(int litre) {
        double price = 45.80;
        return litre * price;
    }
}
