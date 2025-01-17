package ru.job4j.ex;

public class Fact {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("A number less than zero.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Fact.calc(-2);
    }
}
