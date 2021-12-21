package com.epam.izh.rd.online.gameService;

import java.util.Scanner;

/**
 * Класс отвечает за игру "Пользователя"
 */
public class UserPlayer implements Player {
    private int userCountMatch = 1;
    private Scanner scanner;
    private final Matches matches;

    public UserPlayer(Matches matches) {
        this.matches = matches;
    }

    /**
     * вывод количество выбранных спичек пользователем и уменьшает общее количество спичек
     */
    @Override
    public void makeMove() {
        boolean isUnCorrectInput = true;

        while (isUnCorrectInput) {
            try {
                matches.printNumberOfMatches();
                System.out.print("- Ход игрока. Введите количество спичек: ");
                checkInpValue(scanner.nextLine());
                isUnCorrectInput = false;

            } catch (NumberFormatException e) {
                System.out.println("Некорректно введено количество спичек, пожалуйста выберите значение: 1, 2 или 3 спички.");
            }
        }
    }

    /**
     * проверка введенного значения на корректность, согласно правилам игры, и на завершение игры
     *
     * @param inpValue строка переданная пользователем
     */
    private void checkInpValue(String inpValue) {
        if (inpValue.equalsIgnoreCase("exit")) {
            System.exit(0);
        }
        userCountMatch = Integer.parseInt(inpValue);
        if (userCountMatch < 4 && userCountMatch > 0) {
            matches.setNumberOfMatches(userCountMatch);
            checkWinner();
        } else {
            throw new NumberFormatException();
        }
    }

    /**
     * проверка оставшегося количества спичек и вывод победителя
     */
    private void checkWinner() {
        if (matches.getNumberOfMatches() == 1) {
            System.out.println("Для компьютера осталась последняя спичка. Компьютер проиграл!");
            System.exit(0);
        }
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getUserCountMatch() {
        return userCountMatch;
    }

}
