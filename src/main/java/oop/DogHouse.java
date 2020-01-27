package oop;

public class DogHouse {
    public static void main(String[] args) {
        Dog grand = new Dog("Grand");
        System.out.println(grand.getName());
        grand.setName("Victor");
        System.out.println(grand.getName());
        grand.setBreed("GAV");
        System.out.println(grand.getBreed());
        grand.setIsBark(true);
        System.out.println(grand.getIsBark());
        System.out.println("Math.sqrt(4.0) = " + Math.sqrt(4.0));
    }
}
