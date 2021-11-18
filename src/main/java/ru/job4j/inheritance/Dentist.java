package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialty;

    public Dentist(String name, String surname, String education,
                   String birthday, char gender, String specialty) {
        super(name, surname, education, birthday, gender);
        this.specialty = specialty;
    }

    public void brushing(Pacient pacient) {
    }

}
