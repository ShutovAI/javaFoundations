package collections;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Александр");
        arrayList.add("Виталий");
        arrayList.add("Дмитрий");
        arrayList.add("Иван");
        System.out.println("arrayList.get(0) = " + arrayList.get(0));

        System.out.println("arrayList.contains(\"Александр\") = " + arrayList.contains("Александр"));

        System.out.println("Вывод списка for-each: ");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("Вывод списка for-i: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("Список в обратном порядке");
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("Найти Ивана и вывести его индекс: ");
        boolean flag = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equalsIgnoreCase("ИвАн4")) {
                System.out.println("Искомый индекс " + i);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Иванов нет!");
        }

        List<Integer> intArray = new ArrayList<>();
        intArray.add(5);
        intArray.add(3);
        intArray.add(6);

        for (int i = 0; i <intArray.size() ; i++) {
            if(intArray.get(i) % 3 == 0){
                System.out.println(i);
            }
        }
    }
}


