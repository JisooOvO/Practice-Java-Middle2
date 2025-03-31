package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// null 대신 빈 배열을 반환
public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트
        ArrayList<Object> list1 = new ArrayList<>();

        // 빈 불변 리스트
        List<Object> list3 = Collections.emptyList();
        List<Object> list4 = List.of();

        // Arrays.asList
        //   - 배열 그대로 사용
        //   - 길이 고정이지만 값은 변경 가능
        // List.of
        //   - 배열 복사해서 새로운 배열을 만듦
        //   - Immutable

        // List<Integer> noImmutable = Arrays.asList(1, 2, 3);
        //noImmutable.set(1, 3);
        //System.out.println(noImmutable);

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());
    }

}
