package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        // T
        ComplexBox<Dog> hostpital = new ComplexBox<>();
        hostpital.set(dog);

        // 우선순위 제너릭 타입 < 제너릭 메서드
        Cat returnCat = hostpital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }

}
