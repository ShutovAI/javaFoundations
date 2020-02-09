package interfaces;

public class SuperCow implements Cloneable, Comparable<SuperCow> {
    private double power = 100.0;
    private String name;

    public SuperCow() {
    }

    private SuperCow(double power, String name) {
        this.name = name;
        this.power = power;
    }

    public void print() {
        System.out.println("SuperCow!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return new SuperCow(power, name);
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperCow{" + "power=" + power + ", name='" + name + '\'' + '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    @Override
    public int compareTo(SuperCow o) {
        return (int) (power - o.power); // return 0;
    }
}
