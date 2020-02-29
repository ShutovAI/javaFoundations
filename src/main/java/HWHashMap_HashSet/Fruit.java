package HWHashMap_HashSet;

import java.util.Objects;

public class Fruit {
    private String name;
    private int weight;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return " " + name;


    }
}



