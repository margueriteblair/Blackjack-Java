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
                if (BlackjackConsole.getPlayer().equals("Player")) {
                    while (true) {
                        System.out.println("Do you want your Ace worth 1 or 11?");
                        try {
                            int aceVal = scanner.nextInt();
                            if (aceVal != 1 && aceVal != 11) continue;
                            return aceVal;
                        } catch (NumberFormatException | InputMismatchException ex) {
                            ex.printStackTrace();
                        }
                    }
                } else {
                    if (Main.dealer.getPoints() <= 10) return 11;
                    else return 1;
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

    public Ranks getRank() {
        return rank;
    }


}
