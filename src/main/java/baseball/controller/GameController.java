package baseball.controller;

import baseball.service.GameRetryService;
import baseball.service.GameRunnerService;

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
        } while (retryFlag != 2);
    }
}
