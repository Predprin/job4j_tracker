package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String material;

    public Builder(String name, String surname, String education,
                   String birthday, int experience, String material) {
        super(name, surname, education, birthday, experience);
        this.material = material;
    }

    public Builder() {
    }

    public void build(House house) {
    }
}
