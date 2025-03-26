package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        // 아무것도 안 넣으면 Object Type
        // 하위 호환성을 위한 코드
        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
    }
}
