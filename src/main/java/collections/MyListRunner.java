package collections;

import objectPractice.Cake;
import java.util.ArrayList;
import java.util.List;


public class MyListRunner {
    public static void main(String[] args) {


        MyArrayList list = new MyArrayList();
        List list2 = new ArrayList();


        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Эклер", 2, true));
        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Буше", 1, false));
        System.out.println("list.size() = " + list.size());
        list.add("Торт");
        System.out.println("list.size() = " + list.size());
        list.add(555);

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


        List work = new ArrayList();
        work.add(7);
        work.add("Бум");
        work.add(0);
        work.add(44);

        list2.add(555);
        list2.add(7);
        list2.add("Бум");

        list.addAll(work);
        System.out.println("list: " + list);


        System.out.println("list.containsAll(work) = " + list.containsAll(list2));
        System.out.println("work = " + work);


//        MyLinkedList linkedList = new MyLinkedList();
//        new Node ("1",new Node ("3",new Node("7",new Node("5", new Node ("0", null)))));
//
//        linkedList.add(1);
//        linkedList.add(3);
//        linkedList.add(5);
//        linkedList.add(7);
//
//        System.out.println("linkedList.toString() = " + linkedList.toString());
//        linkedList.remove(3);
//        System.out.println("linkedList.toString() = " + linkedList.toString());
//        linkedList.remove(1);

    }
}



