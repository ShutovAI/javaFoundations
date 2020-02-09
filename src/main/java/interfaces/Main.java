package interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Talkable cow = new Cow();
//        Talkable cat = new Cat();
//        Flyable cat2 = new Cat();
//        Cow cow2 = new Cow();
        SuperCow superMurca = new SuperCow();
        superMurca.setName("Matrena");
        SuperCow twinMurka = (SuperCow) superMurca.clone();

        twinMurka.setPower(200);
        System.out.println("twinMurka.toString() = " + superMurca.toString());
        System.out.println("twinMurka.toString() = " + twinMurka.toString());

        int[] numsArray = new int[]{-6, 33, 44, -3, 0, 55};
        Arrays.sort(numsArray);
        System.out.println("numsArray.toString() = " + Arrays.toString(numsArray));

        SuperCow cow1 = new SuperCow();
        SuperCow cow2 = new SuperCow();
        SuperCow cow3 = new SuperCow();
        cow1.setPower(50);
        cow2.setPower(150);

        SuperCow[] superCowArray = new SuperCow[]{cow1, cow2, cow3};
        Arrays.sort(superCowArray);
        System.out.println("Arrays.toString(superCowArray) = " + Arrays.toString(superCowArray));


//        cow.talk();
//        cat.talk();
//        cat2.fly();
//        cat.print();
//        cow.print();  // Приоритет у класса

    }
}


//HW
//1.Реаизовать для SuperCat методы compareTo() и clone();
//2. создать объеты и отсортировать
// (Часть объектов создать с помощью метода clone())
//3. Поиграться с методами класса String
//4. Аудио методы equals(), hashCode() и compareTo()