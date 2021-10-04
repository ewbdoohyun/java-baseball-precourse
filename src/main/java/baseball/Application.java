package baseball;

import baseball.controller.GameController;

public class Application {

    private static GameController gameController;

    private static void init(){
        gameController = new GameController();
    }

    public static void main(String[] args) {
        init();
        // TODO 숫자 야구 게임 구현
        gameController.startProgram();
    }
}
