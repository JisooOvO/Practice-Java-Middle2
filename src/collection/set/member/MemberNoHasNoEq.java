package collection.set.member;

public class MemberNoHasNoEq {

    private String id;

    public MemberNoHasNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHasNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
