package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

    public static void main(String[] args) {
        // 일반 컬렉션은 멀티스레드 상황에서 동기화 문제가 발생
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list class = " + list.getClass());

        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList class =" + synchronizedList.getClass());
    }

}
