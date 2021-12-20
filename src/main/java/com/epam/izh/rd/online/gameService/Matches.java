package com.epam.izh.rd.online.gameService;

/**
 * Класс хранит количество спичек на столе
 * */
public class Matches {
    private int numberOfMatches = 20;

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
            this.numberOfMatches -= numberOfMatches;
    }

    /**
     * вывод оставшихся спичек на столе
     * */
    public void printNumberOfMatches() {
        System.out.println("На столе осталось " + numberOfMatches + " спичек.");
    }
}
