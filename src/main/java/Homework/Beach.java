package Homework;

import java.util.Arrays;

public class Beach {
    public static void main(String[] args) {

        Woman woman1 = new Woman("Marge", 45, 555);
        Woman woman2 = new Woman("Marge", 45, 555);

        System.out.println("woman1.equals(woman2) = " + woman1.equals(woman2));
        System.out.println("woman1 == woman2 = " + (woman1 == woman2));

        Man man1 = new Man("Bob", 50, 777);
        Man man2 = new Man("Bob", 55, 777);
        Man man3 = new Man("Bob", 60, 777);

        Man[] arraysMan = new Man[]{man1,man2,man3};
        System.out.println("Arrays.toString(arraysMan) = " + Arrays.toString(arraysMan));

    }
}
