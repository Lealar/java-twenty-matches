package com.epam.izh.rd.online.gameService;

import java.util.Scanner;

/**
 * Вывод информации перед игрой
 */
public class GameInfo {

    /**
     * Метод принимает пользовательский ввод на выбор начать игру, завершить игру или получить правила игры
     *
     * @param scanner принимает Scanner для пользовательского ввода
     **/
    public static void showInfo(Scanner scanner) {
        System.out.println("Для начала игры введите: play\n" +
                "для ознакомления с правилами игры введите: info\n" +
                "для выхода введите: exit");
        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equalsIgnoreCase("info")) {
                printInfo();
            } else if (inputString.equalsIgnoreCase("play")) {
                System.out.println("Игры началась, удачи:");
                return;
            } else if (inputString.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                System.out.println("Введите корректную команду\n" +
                        "Для начала игры введите: play\n" +
                        "для ознакомления с правилами игры введите: info" +
                        "для выхода введите: exit");
            }
        }
    }

    /**
     * описание правил игры
     */
    private static void printInfo() {
        System.out.println("Игра 20 спичек\n" +
                "Правила игры\n" +
                "В начале игры на столе лежит 20 спичек.\n" +
                "Игроки ходят по очереди, убирая на выбор 1, 2 или 3 спички.\n" +
                "Проигравшим считается тот, кто возьмет со стола последнюю спичку.");
    }
}
