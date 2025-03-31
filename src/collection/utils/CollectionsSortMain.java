package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(100);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // 최대/최소
        System.out.println("Collections.max(list) = " + Collections.max(list));
        System.out.println("Collections.min(list) = " + Collections.min(list));

        // 랜덤 섞기
        Collections.shuffle(list);
        System.out.println(list);

        // 정렬
        Collections.sort(list);
        System.out.println(list);

        // 뒤집기
        Collections.reverse(list);
        System.out.println(list);
    }

}
