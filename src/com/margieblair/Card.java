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

    public int returnCardValue() {
        switch(rank) {
            case ACE -> {
                if (BlackjackConsole.getPlayer().equals("Player")) {
                    if (Main.player1.getPoints() <= 10) return 11;
                    else return 1;
                } else {
                    if (Main.dealer.getPoints() <= 10) return 11;
                    else return 1;
                }

            }
            case TEN, JACK, QUEEN, KING -> {
                return 10;
            }
            default -> {
                return 0;
            }

        }
    }


}
