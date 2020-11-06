package com.margieblair;

import java.util.Scanner;

public class BlackjackConsole {
    static boolean currentPlayerHuman = true;
    protected static DeckOfCards gameDeck = new DeckOfCards();

    static public void runCycle(Player player1, Dealer dealer) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack, Java Style B-) Shuffling deck...");
        gameDeck.shuffle();
        System.out.println(player1.getName() + ", your cards are: ");
        player1.draw(2);
        player1.displayPoints();
        while (true) {
            System.out.println("Hit (1) or stand? (2)");
            int hitOrStand = scanner.nextInt();
            if (hitOrStand == 1) {
                player1.draw(1);
                player1.displayPoints();
                if (player1.getPoints() > 21) {
                    System.out.println("Game over! CPU wins :(");
                    break;
                }
            } else if (hitOrStand == 2) {
                currentPlayerHuman = !currentPlayerHuman;
                System.out.println("Now it's the " + getPlayer() + "'s turn...");
                dealer.draw(2);
                dealer.displayPoints();
                if (dealer.getPoints() < 17) {
                    while (dealer.getPoints() < 17) {
                        dealer.draw(1);
                        dealer.displayPoints();
                    }
                }

                if (dealer.getPoints() < 21 && dealer.getPoints() > player1.getPoints()) {
                    System.out.println("Game over! CPU wins :(");
                    return;
                } else if (player1.getPoints() < 21 && dealer.getPoints() < player1.getPoints()) {
                    System.out.println("Congratulations! Player wins :)");
                    return;
                } else if (dealer.getPoints() > 21 && player1.getPoints() < 21) {
                    System.out.println("Congratulations! Player wins :)");
                    return;
                } else if (player1.getPoints() == dealer.getPoints()) {
                    System.out.println("This is weird...There's been a tie...?");
                    return;
                } else if (dealer.getPoints() == 21 && player1.getPoints() != 21) {
                    System.out.println("Game over! CPU wins :(");
                    return;
                }
            } else {
                throw new IllegalArgumentException("Only input 1 or 2");
            }
        }
    }

    public static String getPlayer() {
        return currentPlayerHuman ? "Player" : "CPU";
    }

}
