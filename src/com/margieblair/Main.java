package com.margieblair;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    protected static Dealer dealer = new Dealer("CPU", 0);
    protected static Player player1 = new Player("Margie", 20); //decided to put this back in the main method for more security


    public static void main(String[] args) {

        BlackjackConsole.runCycle(player1, dealer);


    }
}

