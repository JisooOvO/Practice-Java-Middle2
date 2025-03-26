package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 제너릭 타입과 제너릭 메서드 이름이 T로 같을 경우
    // 제너릭 메서드가 우선
    // T는 Object
    public <T> T printAndReturn(T t) {
        System.out.println("aniaml.className : " + animal.getClass().getName());
        System.out.println("t.className : " + t.getClass().getName());
        return t;
    }

}
