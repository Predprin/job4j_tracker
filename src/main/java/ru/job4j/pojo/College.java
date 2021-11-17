package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student freshman = new Student();
        freshman.setName("Nevskikh Aleksey Victorovich");
        freshman.setGroup("1-04-1");
        freshman.setDate("01.08.2021");
        System.out.println("Студент:          " + freshman.getName());
        System.out.println("Группа:           " + freshman.getGroup());
        System.out.println("Дата поступления: " + freshman.getDate());
    }
}
