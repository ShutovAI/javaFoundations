package collectionsHW;

import java.util.ArrayList;
import java.util.List;

public class CollectionsHW {
    public static void main(String[] args) {

        // 0. Создание списков: пустой список и список размером 20
        List<String> oldList = new ArrayList<>();
        List<String> list = new ArrayList<>(20);

        list.add("Ухо");
        list.add("Нос");
        list.add("Глаз");
        list.add("Рот");

        // 1. Получить элемент по индексу:
        System.out.println("Первый элемент коллекции: " + list.get(0));
        System.out.println("Последний элемент коллекции: " + list.get(list.size() - 1));

        // 2. Задачи на вставку элементов
        // а) Добавить подряд 5 элементов
        int count = 5;
        for (int i = 0; i < list.size(); i++) {
            if (count > 0) {
                list.add("" + count);
                count--;
            }
        }
        System.out.println(list);

        // б) Добавить 6-ой элемент в 3-ю позицию и 7-ой элемент в 1-ую позицию
        list.add(3, list.get(6));
        list.add(1, list.get(7));
        System.out.println(list);

        // в) Записать в новый список все элементы предыдущего списка
        oldList.addAll(list);
        System.out.println(oldList);

        // 4. Проверить наличие элемента
        System.out.println(list.contains("Рот"));

        // 5. Вывод списка на экран в формате: List: {"First","Second","Third"}

//        String[] result = new String[list.size()];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = list.get(i);
//        }
//        System.out.println(list.toArray().toString());
//        System.out.println("result.toString() = " + result.toString());

        // 6. Отфильтровать список
        // а) Условие на индекс: индекс делится на 3
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
        // б) Условие на звначение: Вернуть колличество элементов, которые равны "***"
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("3")) {
                num++;
            }
        }
        System.out.println(num);

        // 7. Пропустить несколько первых элементов
        // а) Пропустить первые 3 элемента в списке
        for (int i = 0; i < list.size(); i++) {
            if (i >= 3) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();

        // 6 + 7. Пропускаем элементы, которые удовлетворяют некоторому условию
        // а) Пропустить первые 2 элемента, которые равные "****"
        list.add("Глаз");
        list.add("Ухо");
        list.add("Глаз");
        System.out.println();
        System.out.println(list);
        int count2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("глаз") && count2 <= 1) {
                count2++;
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();

        // 8. Вернуть первый подходящий элемент:
        // а) Возращаем Первый элемент Делящийся на 3
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(15);
        numbers.add(6);
        numbers.add(12);
        numbers.add(5);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0) {
                System.out.println("Первый элемент, который делится на 3: " + numbers.get(i));
                break;
            }
        }
        //9. Возвращаем все элементы удовлетворяющие условию:
        //а) Возвращаем все элементы делящиеся на 3
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0) {
                System.out.println("Все элементы, которые делятся на 3: " + numbers.get(i));
            }
        }

        //10. Создать класс Person.
        //Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н

        Person recruit1 = new Person("Владимир", 25, 1);
        Person recruit2 = new Person("Николай", 27, 2);
        Person recruit3 = new Person("Вланд", 29, 3);
        Person recruit4 = new Person("Никакой", 29, 4);
        Person recruit5 = new Person("Нурлан", 25, 5);
        List<Person> armyNow = new ArrayList<>();

        armyNow.add(recruit1);
        armyNow.add(recruit2);
        armyNow.add(recruit3);
        armyNow.add(recruit4);
        armyNow.add(recruit5);

        for (int i = 0; i < armyNow.size(); i++) {
            if (armyNow.get(i).toString().startsWith("Н") && armyNow.get(i).age() >= 18 && armyNow.get(i).age() <= 27) {
                System.out.println(armyNow.get(i));
            }
        }
        //11. Найти средний возраст всех женщин.
        Person woman1 = new Person(30);
        Person woman2 = new Person(35);
        Person woman3 = new Person(25);
        Person woman4 = new Person(40);
        List<Person> womanAge = new ArrayList<>();

        womanAge.add(woman1);
        womanAge.add(woman2);
        womanAge.add(woman3);
        womanAge.add(woman4);

        int sum = 0;
        for (int i = 0; i < womanAge.size(); i++) {
            sum = sum + womanAge.get(i).age();
        }
        double middleAge = (double) sum / womanAge.size();
        System.out.println("Среднйи возраст всех женщин: " + middleAge);
    }
}



