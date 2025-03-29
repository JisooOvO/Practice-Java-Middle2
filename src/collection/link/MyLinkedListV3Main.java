package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList= new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);
        String s = stringList.get(0);
        System.out.println(s);

    }

}
