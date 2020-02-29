package HWHashMap_HashSet;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Fruit> fruit = new HashMap();

        // 0. Создание:
        //а). Создадим экземпляр HashMap (Ключ Строка Значение Фрукт)
        fruit.put("оранжевый", new Fruit("Апельсин"));
        fruit.put("синий", new Fruit("Слива"));
        fruit.put("зеленый", new Fruit("Яблоко"));
        fruit.put("красный", new Fruit("Яблоко"));
        System.out.println("fruit = " + fruit);

        //1. Получение элемента по ключу
        System.out.println("fruit.get(\"синий\") = " + fruit.get("синий"));

        //2. Вставка элементов:
        //а). Добавим 5 элементов
        //б). В новый экзмепляр Map добавим старую карту.
        for (int i = 0; i < 5; i++) {
            fruit.put("Фиолетоый" + i, new Fruit("Груша"));
        }
        System.out.println("fruit = " + fruit);
        Map<String, Fruit> numbers = new HashMap<>();
        numbers.put("Вова", new Fruit("Арбуз"));
        numbers.put("Паша", new Fruit("Клубника"));
        numbers.put("Ваня", new Fruit("Банан"));
        System.out.println("fruit.size() = " + fruit.size());
        fruit.putAll(numbers);

        for (Map.Entry<String, Fruit> res : fruit.entrySet()) {
            System.out.println("res = " + res);
        }
        System.out.println("fruit.size() = " + fruit.size());

        //3. Удаление элемента
        //а). Удалим любой фрукт

        System.out.println("fruit.remove(\"Яблоко\") = " + fruit.remove("красный"));
        System.out.println("fruit.size() = " + fruit.size());

        //4. Проверка на наличие ключ и значение

        System.out.println("fruit.containsKey(\"Вова\") = " + fruit.containsKey("синий"));
        System.out.println("fruit.containsValue(\"Арбуз\") = " + fruit.containsValue(new Fruit("Арбуз")));

        //5. Вывод Map на экран:
        //a) Вывести все ключи
        //б) Вывести все значения
        //в) Вывести все ключи и значения с помощью entrySet

        System.out.println("fruit.keySet() = " + fruit.keySet());
        System.out.println("fruit.values() = " + fruit.values());
        System.out.println("fruit.entrySet() = " + fruit.entrySet());

        //6. Отфильтровать Map вернуть записи по некоторому условию:
        //а) Условие на ключ: вернуть количество ключей длина которых больше 5
        //б) Условие на значение: Вернуть количество элементов, которые равны "***"

        int count = 0;
        for (Map.Entry<String, Fruit> keyFilter : fruit.entrySet()) {
            if (keyFilter.getKey().length() > 5) {
                count++;
            }
        }
        System.out.println(count);

        int sum = 0;
        for (Map.Entry<String, Fruit> valueFilter : fruit.entrySet()) {
            if (valueFilter.getValue().equals(new Fruit("Груша"))) {
                sum++;
            }
        }
        System.out.println(sum);

        //7. Пропустить несколько элементов
        //а) Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.
        //б) Вывести все кроме 2 элементов, ключи которых начинаются на А

        fruit.put("полосатый", new Fruit("Арбуз"));
        fruit.put("Зелено-зеленый", new Fruit("Арбуз"));
        fruit.put("бархатный", new Fruit("Арбуз"));

        Object[] tempValue = new Object[fruit.size()];
        tempValue = fruit.values().toArray();
        int sum2 = 0;
        for (int i = 0; i < fruit.size(); i++) {
            if (tempValue[i].equals(new Fruit(("Арбуз"))) && sum2 < 2) {
                sum2++;
                continue;
            } else {
                System.out.print(tempValue[i] + " ");
            }
        }

        fruit.put("Ахтунг", new Fruit("Мультифрукт"));
        fruit.put("Анапест", new Fruit("Ежевика"));
        fruit.put("Альпы", new Fruit("Киви"));

        System.out.println();
        System.out.println(fruit.keySet());
        System.out.println();
        Object[] tempKey = new Object[fruit.size()];
        tempKey = fruit.keySet().toArray();
        int sum3 = 0;
        for (int i = 0; i < fruit.size(); i++) {
            if (tempKey[i].toString().startsWith("А") && sum3 < 2) {
                sum3++;
                continue;
            } else {
                System.out.print(tempKey[i] + " ");
            }
        }
        //8. Вернуть первый подходящий элемент:
        //а) Возращаем элемент значение которого арбуз или Арбуз или АРбУз_.
        System.out.println();
        System.out.println("_________________");

        Object[] checkValue = new Object[fruit.size()];
        checkValue = fruit.values().toArray();
        for (int i = 0; i < fruit.size(); i++) {
            if (checkValue[i].toString().equalsIgnoreCase(("арбуз"))) {
                System.out.print(checkValue[i]);
                break;
            }
        }

        //9. Возвращаем все элементы удовлетворяющие условию:
        //а) Возвращаем все элементы в другую карту, которые являются фруктами

        Map<String, Fruit> checkFruit = new HashMap();
            checkFruit.putAll(fruit);
        System.out.println("checkFruit = " + checkFruit);

        //10. Найти средний вес всех фруктов.

//        Map<String, Fruit> bigFruit = new HashMap();
//
//        bigFruit.put("Апельсин", new Fruit(7));
//        bigFruit.put("Банан", new Fruit(2));
//        bigFruit.put("Виноград", new Fruit(3));
//        bigFruit.put("Яблоко", new Fruit(8));
//
//
//        Object[] mass = new Object[bigFruit.size()];
//        mass = bigFruit.values().toArray();
//        int summ = 0;
//        for (int i = 0; i < bigFruit.size(); i++) {
//        }
//        System.out.println("summ/size = " + summ / bigFruit.size());
//        //        for (Map.Entry<String, Fruit> x : bigFruit.entrySet()) {
////            summ = bigFruit.values() + summ;
////        }
        Map<String, Integer> frutis = new HashMap();
        frutis.put("Вишня", 9);
        frutis.put("Киви", 8);
        frutis.put("Мандарин", 1);

        int epsilon = 0;
        for (Map.Entry<String, Integer> x : frutis.entrySet()) {
            epsilon = epsilon + x.getValue();
        }

        System.out.println(epsilon / frutis.size());
    }
}







