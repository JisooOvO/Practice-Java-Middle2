package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        int loop = 10_000;

        System.out.println("== MyArrayList ==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size); // 찾기 O(1) 밀기 O(N)
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size);
        getIndex(arrayList, loop, 0); // 앞
        getIndex(arrayList, loop, size / 2); // 중간
        getIndex(arrayList, loop, size - 1); // 뒤
        search(arrayList, loop, 0); // 앞
        search(arrayList, loop, size / 2); // 중간
        search(arrayList, loop, size - 1); // 뒤

        System.out.println();

        System.out.println("== MyLinkedList ==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size); // 찾기 O(N) 밀기 O(1)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);
        getIndex(linkedList, loop, 0); // 앞
        getIndex(linkedList, loop, size / 2); // 중간
        getIndex(linkedList, loop, size - 1); // 뒤
        search(linkedList, loop, 0); // 앞
        search(linkedList, loop, size / 2); // 중간
        search(linkedList, loop, size - 1); // 뒤
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index : " + index + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue : " + findValue + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");

    }
}
