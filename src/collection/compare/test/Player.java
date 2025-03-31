package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements Comparable<Player> {
    private final String name;
    private final List<Card> hands;
    private int sum = 0;

    public Player(String name) {
        this.name = name;
        this.hands = new ArrayList<Card>();
    }

    public void draw(Card card){
        hands.add(card);
        sum += card.getRank();
    }

    public void sort(){
        hands.sort(null);
    }

    public void showCards(){
        sort();

        System.out.print(name + "의 카드 : [ ");
        for (int i = 0; i < hands.size(); i++) {
            System.out.print(hands.get(i));
            if(i != hands.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ], 합계 : " + sum);
    }

    @Override
    public int compareTo(Player player) {
        int result = Integer.compare(sum, player.sum);

        switch (result) {
            case 1 -> System.out.println(name + " 승리");
            case 0 -> System.out.println("무승부");
            case -1 -> System.out.println(player.name + " 승리");
        }

        return result;
    }
}
