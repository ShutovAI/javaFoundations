package collections;

import objectPractice.Cake;
import java.util.ArrayList;
import java.util.List;


public class MyListRunner {
    public static void main(String[] args) {

        List l = new ArrayList();
        List j = new ArrayList();


        j.add(3);
        j.add(4);

        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();


        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Эклер", 2, true));
        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Буше", 1, false));
        System.out.println("list.size() = " + list.size());
        list.add("Торт");
        System.out.println("list.size() = " + list.size());
        list.add("555");

        System.out.println(list.toString());
        System.out.println("list.get(1) = " + list.get(1));
        list.set(2, "Порт");
        System.out.println("list.set(2, \"Порт\") " + list.toString());
        list.remove(1);
        System.out.println("list.remove(1) " + list.toString());
        list.remove("Порт");
        System.out.println("list.remove(\"Порт\"): " + list.toString());
        System.out.println("list.size() = " + list.size());
        list.add(0, "123");
        System.out.println("list.add(0,\"123\") " + list.toString());
        System.out.println("list.size() = " + list.size());
        System.out.println("list.indexOf(555) = " + list.indexOf("555"));
//        list.clear();
//        System.out.println("list.clear: " + list.toString());


//        list2.addAll(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list2.size() = " + list2.size());
        System.out.println("list2: " + list2);

        System.out.println("l.addAll(j) = " + l.addAll(j));
        System.out.println("l: " + l);

    }
}



