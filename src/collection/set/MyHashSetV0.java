package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] element = new int[10];
    private int size = 0;

    // O(N)
    public boolean add(int value) {
        if (contains(value)){
            return false;
        }

        element[size++] = value;
        return true;
    }

    // O(N)
    public boolean contains(int value) {
        for (int data : element) {
            if(data == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "element=" + Arrays.toString(Arrays.copyOf(element, size)) +
                ", size=" + size +
                '}';
    }
}
