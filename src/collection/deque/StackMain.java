package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 조회
        System.out.println("stack.peek() = " + stack.peek());

        // pop
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);

        // Vector -> 옛날 자료구조 호환성을 위해 남겨둠
        // 더 빠른 DEQUE를 사용할 것!!!
    }

}
