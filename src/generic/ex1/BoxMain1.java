package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer i = integerBox.get();
        System.out.println("i = " + i);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String s = stringBox.get();
        System.out.println("s = " + s);
    }

}
