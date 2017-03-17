package com.tasks3.carddeck;

//import javax.smartcardio.Card;

import java.util.*;

public class Deck {

    Suit[] suits = Suit.values;
    List<Suit> suitlist = Arrays.asList(suits);

    Rank[] ranks = Rank.values;
    List<Rank> ranklist = Arrays.asList(ranks);

    public static void main (String[] args){
        Deck deck = new Deck();
        System.out.println(deck.deckStorage().toString());
    }


    public List<Card> deckStorage() {

        List<Card> carddeck = new LinkedList<Card>();
        for (int i = 0; i <= (ranklist.size()-1); i++) {
            for (int j = 0; j <= (suitlist.size()-1); j++) {
                Card card = new Card(ranklist.get(i), suitlist.get(j));
                carddeck.add(card);
            }
        }
        return carddeck;
    }


    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Collections.shuffle(this.deckStorage());
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
        Suit.HEARTS.getName();
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        Iterator it = this.deckStorage().iterator();
        if (it.hasNext() == true){
            return true;
        }
        else {
            return false;
        }
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    /*public Card drawOne() {
    }*/

}

