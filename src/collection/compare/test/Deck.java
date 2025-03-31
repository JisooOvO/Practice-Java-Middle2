package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>(52);
        initDeck();
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    private void initDeck() {
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }

    public Card draw(){
        return deck.removeFirst();
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}