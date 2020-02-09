package Homwork2;

public class SuperCat implements Cloneable, Comparable<SuperCat> {
    private int age;
    private String name;

    public SuperCat() {
    }

    public SuperCat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(SuperCat o) {
        return this.age - o.age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Возраст кота = " + age + ", имя кота = " + name;
    }
}