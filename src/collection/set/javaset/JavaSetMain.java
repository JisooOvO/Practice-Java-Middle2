package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<String>()); // 순서 X O(1)
        run(new LinkedHashSet<String>()); // 들어온 순서 O(1)
        run(new TreeSet<String>()); // 데이터의 크기 순서(정렬) O(log N)
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
