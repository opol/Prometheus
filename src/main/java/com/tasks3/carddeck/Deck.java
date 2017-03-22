package com.tasks3.carddeck;

import java.util.*;

public class Deck {
    static List<Suit> suitlist = Arrays.asList(Suit.values);
    static List<Rank> ranklist = Arrays.asList(Rank.values);

    private List<Card> cards;
    private ListIterator<Card> cardListIterator;

    public Deck() {
        super();
        initDeck();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void initDeck() {
        this.cards = new LinkedList<Card>();
        for (int i = 0; i <= (suitlist.size() - 1); i++) {
            for (int j = 0; j <= (ranklist.size() - 1); j++) {
                Card card = new Card(ranklist.get(j), suitlist.get(i));
                this.cards.add(card);
            }
        }
        initIterator();
    }


    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Collections.shuffle(this.cards);
        /*for (Card card : cards) {
            System.out.format("%s %s \n", card.getSuit().getName(), card.getRank().getName());
        }*/
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
        Deck deck = new Deck();
        deck.initDeck();
        List<Card> cards = deck.getCards();


        Collections.sort(cards, new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                int r1 = ranklist.indexOf(c1.getRank());
                int r2 = ranklist.indexOf(c2.getRank());
                int s1 = suitlist.indexOf(c1.getSuit());
                int s2 = suitlist.indexOf(c2.getSuit());
                return (s1 < s2) ? -1 : ((s1 == s2) ? (r1 < r2) ? -1 : ((r1 == r2) ? 0 : 1) : 1);
            }
        });
        /*for (Card card : cards) {
            System.out.format("%s %s \n", card.getSuit().getName(), card.getRank().getName());
        }*/

    }

    public void initIterator() {
        cardListIterator = cards.listIterator(cards.size());
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return cardListIterator.hasNext();
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (cardListIterator.hasPrevious()) {
            return cardListIterator.previous();
        } else {
            return null;
        }
    }

}

