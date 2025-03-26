package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

import java.lang.reflect.Field;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        // 타입 제한
        // AnimalHospitalV3<Object> objectHospital = new AnimalHospitalV3();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이
        catHospital.set(cat);
        catHospital.checkup();

        // 개 병원에 고양이를 전달 불가
        // dogHospital.set(cat);

        // 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }

}
