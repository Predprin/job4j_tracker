package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int experience;

    public Surgeon(String name, String surname, String education,
                   String birthday, char gender, int experience) {
        super(name, surname, education, birthday, gender);
        this.experience = experience;
    }

    public Surgeon() {
    }

    public BodyPart remove(Pacient pacient) {
        BodyPart leg = new BodyPart();
        return leg;
    }

}
