package com.margieblair;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Hand{
    private int points;
    private List<Integer> cpuCards = new ArrayList<>();
    private String name;

    public Dealer(String name, int bet) {
        super("CPU", 0);
    }

    public void displayPoints() {
        var total = cpuCards.stream().mapToInt(i -> i).sum();
        System.out.println(name + " your total right now is " + total + " .");
        points = total;
    }


}
