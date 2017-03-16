package com.tasks3.carddeck;

import javax.smartcardio.Card;

public class Deck {

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
    }
    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
    }

    public class Card {
        private Rank rank;
        private Suit suit;

        public Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public Rank getRank() {
            return rank;
        }

        public void setRank(Rank rank) {
            this.rank = rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public void setSuit(Suit suit) {
            this.suit = suit;
        }
    }

    public class Rank {
        public static final Rank ACE = new Rank("Ace");
        public static final Rank KING = new Rank("King");
        public static final Rank QUEEN = new Rank("Queen");
        public static final Rank JACK = new Rank("Jack");
        public static final Rank TEN = new Rank("10");
        public static final Rank NINE = new Rank("9");
        public static final Rank EIGHT = new Rank("8");
        public static final Rank SEVEN = new Rank("7");
        public static final Rank SIX = new Rank("6");

        public static Rank[] values = { ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX };

        private String name;

        Rank(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Suit {
        public static final Suit HEARTS = new Suit("HEARTS");
        public static final Suit DIAMONDS = new Suit("DIAMONDS");
        public static final Suit CLUBS = new Suit("CLUBS");
        public static final Suit SPADES = new Suit("SPADES");

        public static Suit[] values = { HEARTS, DIAMONDS, CLUBS, SPADES};

        private String name;

        Suit(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

