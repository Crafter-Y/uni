package game;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CardGame {
    private final Stack<PlayingCard> stack = new Stack<>();

    public CardGame() {
        for (Suit suit : Suit.values()) {
            for (CardValue value : CardValue.values()) {
                this.stack.add(new PlayingCard(suit, value));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(this.stack);
    }

    private void sort() {
        Collections.sort(this.stack);
    }

    private PlayingCard get() {
        return this.stack.pop();
    }

    private List<PlayingCard> all() {
        return this.stack.stream().toList();
    }

    private enum Suit {
        DIAMONDS("Karo"),
        HEART("Herz"),
        SPADE("Pik"),
        CLUBS("Kreuz");

        private final String name;

        Suit(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    private enum CardValue {
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        JACK("Bube"),
        QUEEN("Dame"),
        KING("König"),
        TEN("10"),
        ACE("Ass");

        private final String name;

        CardValue(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    private record PlayingCard(Suit suit, CardValue value) implements Comparable<PlayingCard>{
        @Override
        public String toString() {
            return String.format("%s %s", this.suit, this.value);
        }

        @Override
        public int compareTo(PlayingCard other) {
            if (this.suit.ordinal() == other.suit.ordinal()) {
                if (this.value.ordinal() == other.value.ordinal()) return 0;
                return this.value.ordinal() > other.value.ordinal() ? 1 : -1;
            }
            return this.suit.ordinal() > other.suit.ordinal() ? 1 : -1;
        }
    }

    private static class TestGame {
        public TestGame() {
            CardGame game = new CardGame();


            game.shuffle();

            for (int i = 0; i < 10; i++) {
                PlayingCard chosen = game.get();
                int comp = chosen.compareTo(new PlayingCard(Suit.HEART, CardValue.SEVEN));
                StringBuilder result = new StringBuilder()
                        .append(chosen)
                        .append(" ist ");

                switch (comp) {
                    case -1: result.append("kleiner"); break;
                    case 1: result.append("größer"); break;
                    case 0: result.append("gleich"); break;
                }

                result.append(" Herz 7");
                System.out.println(result);
            }

            game.sort();

            System.out.println("Remaining Cards:");
            for (PlayingCard playingCard : game.all()) {
                System.out.println(playingCard);
            }
        }
    }

    public static void main() {
        new TestGame();
    }
}
