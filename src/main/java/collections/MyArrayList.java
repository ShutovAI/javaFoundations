package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyArrayList<T> {
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
        this.size = 0;
    }

    public MyArrayList(int length) {
        this.size = 0;
        array = new Object[length];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, size);  //Массив до определенной длины
    }


    public boolean add(Object o) {
        if (array.length == size) {
            Object[] tempArray = new Object[(3 * array.length) / 2 + 1];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList: ");
        for (int i = 0; i < size; i++) {
            result.append("[ ").append(array[i]).append(" ]");
        }
        return result.toString();
    }

    public boolean remove(T o) {
        int count = 0;
        Object[] res = new Object[size];
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                continue;
            } else {
                res[count] = array[i];
            }
            count++;
        }
        size = size - 1;
        array = res;
        return true;
    }


    public boolean addAll(List<Object> resAdd) {
        for (Object l : resAdd) {
            add(l);
        }
        return true;
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }


    public Object get(int index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return array[i];
            }
        }
        return null;
    }


    public Object set(int index, Object element) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                array[i] = element;
            }
        }
        return null;
    }


    public void add(int index, Object element) {
        int count = 0;
        Object[] tempArray = new Object[size + 1];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                tempArray[i] = element;
                continue;
            } else {
                tempArray[i] = array[count];
            }
            count++;
        }
        size++;
        array = tempArray;
    }

    public Object remove(int index) {
        int count = 0;
        Object[] res = new Object[size];
        for (int i = 0; i < size; i++) {
            if (i == index) {
                continue;
            } else {
                res[count] = array[i];
            }
            count++;
        }
        size = size - 1;
        array = res;
        return array;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsAll(List<T> c) {
        List<T> res = new ArrayList();
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < c.size(); i++) {
                if (array[j].equals(c.get(i))) {
                    res.add(c.get(i));
                } else {
                    continue;
                }
            }
        }
        if (res.equals(c)) {
            return true;
        } else {
            return false;
        }
    }
}


