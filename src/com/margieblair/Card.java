package com.margieblair;

public class Card {
    private Suit suit;
    private Ranks rank;

    public Card(Suit suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public void displayCard() {
        System.out.println(suit + " " + rank);
    }

    public int returnCardValue() {
        switch(rank) {
            case ACE -> {
                return 1;
            }
            case TWO -> {
                return 2;
            }
            case THREE -> {
                return 3;
            }
            case FOUR -> {
                return 4;
            }
            case FIVE -> {
                return 5;
            }
            case SIX -> {
                return 6;
            }
            case SEVEN -> {
                return 7;
            }
            case EIGHT -> {
                return 8;
            }
            case NINE -> {
                return 9;
            }
            case TEN, JACK, QUEEN, KING -> {
                return 10;
                //you use a comma to separate the different cases that would result in the same value
            }
            default -> {
                return 0;
            }

        }
    }


}
