package Homework;

public class Woman {
    private String name;
    private int age;
    private int passport;

    public Woman(String name, int age, int passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woman woman = (Woman) o;
        return name == woman.name && age == woman.age &&
                passport == woman.passport;
    }

    @Override
    public int hashCode() {
        return passport;
    }
}
