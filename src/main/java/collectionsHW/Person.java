package collectionsHW;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public int age(){
        return age;
    }
}



