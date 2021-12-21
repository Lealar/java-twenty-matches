package com.epam.izh.rd.online.gameService;


/**
 * Класс отвечает за игру "компьтера"
 */
public class ComputerPlayer implements Player {
    private int countMatches;
    private final Matches matches;
    private final UserPlayer userPlayer;

    public ComputerPlayer(Matches matches, UserPlayer userPlayer) {
        this.matches = matches;
        this.userPlayer = userPlayer;
    }

    /**
     * выводит количество выбранных спичек и уменьшает их общее количество
     */
    @Override
    public void makeMove() {
        matches.printNumberOfMatches();
        setCountMatches();
        System.out.printf("- Количество выбранных компьютером спичек = %d.\n", countMatches);
        matches.setNumberOfMatches(countMatches);
        checkWinner();
    }

    /**
     * устанавливает сколько спичек выбирет компьютер
     */
    private void setCountMatches() {
        countMatches = 4 - userPlayer.getUserCountMatch();
    }

    /**
     * проверяет сколько спичек осталось и определяет победителя
     */
    private void checkWinner() {
        if (matches.getNumberOfMatches() == 1) {
            System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
            System.exit(0);
        }
    }
}
