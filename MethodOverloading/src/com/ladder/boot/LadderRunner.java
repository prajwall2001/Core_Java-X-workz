package com.ladder.boot;

import com.ladder.app.Ladder;

public class LadderRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in LadderRunner");
        Ladder ladder = new Ladder();
        ladder.climb();
        ladder.climb("Wooden", 5);
    }
}
