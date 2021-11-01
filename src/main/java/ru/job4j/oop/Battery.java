package ru.job4j.oop;

public class Battery {
    private  int load;

    public Battery(int level) {
        this.load = level;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(60);
        Battery second = new Battery(30);
        System.out.println("Battery charge level No. 1 = " + first.load);
        System.out.println("Battery charge level No. 2 = " + second.load);
        first.exchange(second);
        System.out.println("Battery charge level No. 1 = " + first.load);
        System.out.println("Battery charge level No. 2 = " + second.load);
    }

}
