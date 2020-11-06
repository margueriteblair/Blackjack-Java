package com.margieblair;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Margie", 20);
        Dealer dealer = new Dealer("CPU", 10);

            BlackjackConsole.runCycle(player1, dealer);

    }
}
