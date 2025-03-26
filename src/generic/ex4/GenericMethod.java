package generic.ex4;

public class GenericMethod<Z> {
    private Z value;

    public static Object objMethod(Object obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    // 제너릭 메서드
    // 메서드 안에서만 제너릭 사용
    public static <T> T genericMethod(T obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print : " + t);
        return t;
    }

    public Z instanceMethod(){
        return value;
    }

    // static Z staticMethod(){
    //    return void;
    // }
}
