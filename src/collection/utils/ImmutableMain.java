package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        // 불변 리스트 -> mutable
        List<Integer> list = List.of(1, 2, 3);
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList class = " + mutableList.getClass());

        // mutable -> 불변 리스트
        List<Integer> immutableList = Collections.unmodifiableList(mutableList);
        System.out.println("immutableList class = " + immutableList.getClass());
        // immutableList.set(1);
    }

}
