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

    public int getRank() {
        return rank;
    }

    public void displayCard() {
        System.out.println(suit + " " + returnCardValue());
    }

    public String returnCardValue() {
        String output = "";
            switch(rank) {
                case 1:
                    output = "ACE"; //still need to include the ace logic
                    break;
                case 11:
                    output = "JACK";
                    break;
                case 12:
                    output = "QUEEN";
                    break;
                case 13:
                    output = "KING";
                    break;
                default:
                    output = rank == 10 ? Integer.toString(rank) : " " + rank;
            }
            return output;

        }
    }


