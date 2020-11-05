package com.margieblair;

import java.util.Scanner;

public class Card {
    private Suit suit;
    private Ranks rank;
    private Scanner scanner = new Scanner(System.in);

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
                System.out.println("Do you want your Ace worth 1 or 11?");
                int aceVal = scanner.nextInt();
                return aceVal;
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
