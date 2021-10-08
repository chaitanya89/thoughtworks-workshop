package com.thoughtworks.cricket.input;

import java.util.Scanner;

public class ConsoleCricketInputReader implements CricketInputReader {

    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public Integer readScore() {
        return readFromConsole("Enter target score: ");
    }

    @Override
    public Integer readOvers() {
        return readFromConsole("Enter target overs: ");
    }

    @Override
    public Integer readBatsmanType() {
        return readFromConsole("Enter batsman type: ");
    }

    private int readFromConsole(String action) {
        int input;
        System.out.println(action);
        input = scanner.nextInt();
        return input;
    }
}
