package objectPractice;

public class Train {
    public static void main(String[] args) {
        Man man1 = new Man("Боб", 32.0, 180.0, 180.0, "+180");
        Man man2 = new Man("Боб", 32.0, 180.0, 180.0, "+180");


        System.out.println("man1 == man2 = " + (man1 == man2));

        Man man3 = man1;

        System.out.println("man1 == man3 = " + (man1 == man3));

        System.out.println("man1.equals(man2) = " + man1.equals(man2));
        System.out.println("man1.equals(man3) = " + man1.equals(man3));
    }
}
//1. Women , 3 поля.
// И класс Beach (psvm) equals и hashCode, без методов compare
//2. Создать несолько объектов мужиков и добавить х в один массиввывести с помощью Arrays.toString(Array);