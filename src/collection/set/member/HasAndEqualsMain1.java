package collection.set.member;

import collection.set.MyHashSetV2;

public class HasAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        MemberNoHasNoEq m1 = new MemberNoHasNoEq("A");
        MemberNoHasNoEq m2 = new MemberNoHasNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 중복 등록
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberNoHasNoEq searchValue = new MemberNoHasNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));
    }

}
