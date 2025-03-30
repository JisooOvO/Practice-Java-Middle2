package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        int loop = 10_000;

        System.out.println("== ArrayList ==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size); // 찾기 O(1) 밀기 O(N)
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);
        getIndex(arrayList, loop, 0); // 앞
        getIndex(arrayList, loop, size / 2); // 중간
        getIndex(arrayList, loop, size - 1); // 뒤
        search(arrayList, loop, 0); // 앞
        search(arrayList, loop, size / 2); // 중간
        search(arrayList, loop, size - 1); // 뒤

        System.out.println();

        System.out.println("== LinkedList ==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size); // 찾기 O(N) 밀기 O(1)
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size);
        getIndex(linkedList, loop, 0); // 앞
        getIndex(linkedList, loop, size / 2); // 중간
        getIndex(linkedList, loop, size - 1); // 뒤
        search(linkedList, loop, 0); // 앞
        search(linkedList, loop, size / 2); // 중간
        search(linkedList, loop, size - 1); // 뒤
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index : " + index + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue : " + findValue + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");

    }
}
