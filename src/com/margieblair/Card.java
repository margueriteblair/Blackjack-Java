package com.margieblair;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Card {
    private Suit suit;
    private int rank;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public void displayCard() {
        System.out.println(suit + " " + rank);
    }

    public String returnCardValue() {
        String output = "";
            switch(rank) {
                case 1:
                    output = "ACE";
                    break;
                case 11:
                    output = "JA";
                    break;
                case 12:
                    output = "QU";
                    break;
                case 13:
                    output = "KI";
                    break;
                default:
                    output = rank == 10 ? Integer.toString(rank) : " " + rank;
            }
            return output;

        }
    }


}
