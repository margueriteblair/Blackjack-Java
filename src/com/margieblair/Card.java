package com.margieblair;

import java.util.InputMismatchException;
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
                while (true) {
                    System.out.println("Do you want your Ace worth 1 or 11? Any other answers will default to 1.");
                    Integer aceVal = scanner.nextInt();
                    try {
                        if (aceVal != 1 || aceVal != 11) continue;
                        if (!(aceVal instanceof Integer)) continue;
                        if (aceVal == 1 || aceVal == 11) return aceVal;
                    } catch (NumberFormatException | InputMismatchException ex) {
                        ex.printStackTrace();
                    }
                }
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
            }
            default -> {
                return 0;
            }

        }
    }


}
