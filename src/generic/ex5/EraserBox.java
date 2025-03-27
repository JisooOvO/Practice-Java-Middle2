package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
        // 타입 이레이저 발생후 T => Object
        // 항상 true를 반환 -> 개발자의 의도와 맞지 않으므로 컴파일 에러 발생
        // return param instanceof T;
        return false;
    }

    public void create(){
        // return new T();
    }

}
