package HWHashMap_HashSet;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {


        Set<Integer> wood = new HashSet();

        wood.add(5);
        wood.add(7);
        wood.add(8);
        System.out.println("wood = " + wood);
        System.out.println("wood.add(8) = " + wood.add(8));

        for (Integer forest : wood) {
            System.out.print(forest + " ");
        }

    }
}

