package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        System.out.println("integer = " + (Integer) integerBox.get());

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        System.out.println("str = " + (String) stringBox.get());

        // 잘못된 타입의 인수 전달 시
        // integerBox.set("문자100");
        // Integer result = (Integer) integerBox.get();
        // System.out.println("result = " + result);
    }

}
