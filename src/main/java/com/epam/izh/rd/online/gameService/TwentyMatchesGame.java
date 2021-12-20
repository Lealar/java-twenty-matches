package com.epam.izh.rd.online.gameService;

import java.util.Scanner;

/**Стартовый класс игры 20 спичек*/
public class TwentyMatchesGame {
    private final Matches matches = new Matches();
    private final UserPlayer userPlayer = new UserPlayer(matches);
    private final ComputerPlayer computerPlayer = new ComputerPlayer(matches, userPlayer);

    /*
    * метод реализующий запуск игры 20 спичек
    * */
    public void runGame(){
        try (Scanner scanner = new Scanner(System.in)){
            GameInfo.showInfo(scanner);
            userPlayer.setScanner(scanner);
            while (matches.getNumberOfMatches() > 1){
                computerPlayer.makeMove();
                userPlayer.makeMove();

            }
        }
    }
}
