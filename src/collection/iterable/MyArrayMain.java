package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println("number = " + number);
        }

        // 향상된 for문 == iterator
        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
    }

}
