package Homwork2;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        SuperCat barsik = new SuperCat(5, "Барсик");
        SuperCat megaBarsik = (SuperCat) barsik.clone();
        SuperCat murzik = new SuperCat(2, "Мурзик");
        SuperCat tom = new SuperCat(4, "Том");
        SuperCat megaTom = (SuperCat) tom.clone();

        megaBarsik.setAge(2);
        megaBarsik.setName("МегаБарсик");
        megaTom.setAge(3);
        megaTom.setName("МегаТом");

        System.out.println("Барсик: " + barsik.toString());
        System.out.println("МегаБарсик: " + megaBarsik.toString());
        System.out.println("Мурзик: = " + murzik.toString());
        System.out.println("Том: = " + tom.toString());
        System.out.println("МегаТом: = " + megaTom.toString());

        SuperCat[] catArray = new SuperCat[]{barsik, megaBarsik, murzik, tom, megaTom};

        Arrays.sort(catArray);
        System.out.println("Arrays.toString() = " + Arrays.toString(catArray));

        System.out.println("Class String");
        String string = "wOrd";
        String word = "Word";
        System.out.println("string.equalsIgnoreCase(string) = " + string.equalsIgnoreCase(word));
        System.out.println("string.equals() = " + string.equals(word));
        System.out.println("string.charAt(1) = " + string.charAt(1));
        System.out.println("string.compareTo(string) = " + string.compareTo(string));
        System.out.println("string.toLowerCase(string) = " + string.toLowerCase());
    }
}