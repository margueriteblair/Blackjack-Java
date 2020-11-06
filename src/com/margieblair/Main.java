package com.margieblair;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    protected static Player player1 = new Player("Margie", 20);
    protected static Dealer dealer = new Dealer("CPU", 10);

    public static void main(String[] args) {


            BlackjackConsole.runCycle(player1, dealer);

    }
}
