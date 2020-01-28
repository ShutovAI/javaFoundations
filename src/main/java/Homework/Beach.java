package Homework;

import java.util.Arrays;

public class Beach {
    public static void main(String[] args) {

        Woman woman1 = new Woman("Marge", 45, 555);
        Woman woman2 = new Woman("Marge", 45, 5555);

        System.out.println("woman1.equals(woman2) = " + woman1.equals(woman2));

        Woman man1 = new Woman("Bob", 50, 777);
        Woman man2 = new Woman("Bob", 55, 777);
        Woman man3 = new Woman("Bob", 60, 777);

        Woman[] arraysMan = new Woman[]{man1,man2,man3};

        System.out.println("Arrays.toString(arraysMan) = " + Arrays.toString(arraysMan));

    }
}
