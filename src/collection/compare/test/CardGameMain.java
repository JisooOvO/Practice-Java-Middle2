package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        draw(player1, deck);
        draw(player2, deck);

        player1.showCards();
        player2.showCards();

        int result = player1.compareTo(player2);
        System.out.println(result);
    }

    private static void draw(Player player, Deck deck) {
        for (int i = 0; i < 5; i++) {
            player.draw(deck.draw());
        }
    }

}