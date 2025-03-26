package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이
        catHospital.set(cat);
        catHospital.checkup();

        // 개 병원에 고양이를 전달 - 컴파일 오류
        // dogHospital.set(cat);

        // 개 타입 반환
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }

}
