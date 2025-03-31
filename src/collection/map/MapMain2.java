package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        // 같은 키 저장 시 기본 값 교체
        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        studentMap.remove("studentA");
        System.out.println(studentMap);
    }

}
