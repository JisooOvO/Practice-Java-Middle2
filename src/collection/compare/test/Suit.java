package collection.compare.test;

// Enum -> CompareTo가 이미 구현(변경 불가)
public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private final String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
