package com.margieblair;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Hand{
    private int cpuTotalPoints;
    private List<Integer> cpuCards = new ArrayList<>();

    public Dealer(String name, int bet) {
        super("CPU", 0);
    }

}