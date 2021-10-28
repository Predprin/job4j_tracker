package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.print("Кот по кличке " + this.name);
        System.out.println(" ел сегодня " + this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.giveNick("Гав");
        black.giveNick("Чёрный");
        gav.eat("молоко.");
        black.eat("сосиски.");
        gav.show();
        black.show();
    }
}
