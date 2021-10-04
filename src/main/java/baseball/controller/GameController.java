package baseball.controller;

import baseball.service.console.GameRetryService;
import baseball.service.console.GameRunnerService;

import static baseball.service.console.GameRetryService.EXIT_VALUE;

public class GameController {

    private final GameRunnerService gameRunnerService;
    private final GameRetryService gameRetryService;

    public GameController(){
        gameRunnerService = new GameRunnerService();
        gameRetryService = new GameRetryService();
    }

    public void startProgram() {

        int retryFlag;
        do {
            gameRunnerService.startGame();
            retryFlag = gameRetryService.isRetry();
        } while (EXIT_VALUE == retryFlag);
    }
}
