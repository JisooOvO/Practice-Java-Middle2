package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이
        catHospital.set(cat);
        catHospital.checkup();

        // 개 병원에 고양이를 전달 - 매개변수 체크 실패 -> 컴파일 오류 발생 X
        // 코드 재사용성은 늘었으나 타입 안정성이 낮음
        dogHospital.set(cat);

        // 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }

}
