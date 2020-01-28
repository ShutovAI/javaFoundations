package Homework;

import java.util.Objects;

public class Woman {
    private String name;
    private int age;
    private int telephone;

    public Woman(String name, int age, int telephone) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Woman " +
                "name = " + name +
                ", age = " + age +
                ", telephone = " + telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woman woman = (Woman) o;
        return age == woman.age &&
                telephone == woman.telephone &&
                Objects.equals(name, woman.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephone);
    }
}