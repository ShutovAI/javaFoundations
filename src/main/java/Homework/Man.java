package Homework;

public class Man {
    private String name;
    private int age;
    private int telephone;

    public Man(String name, int age, int telephone) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Man " + "name = " + name + " age = " + age + " telephone = " + telephone;
    }
}
