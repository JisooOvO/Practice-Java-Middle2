package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana grape";
        HashMap<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        System.out.println(map);
    }

}
