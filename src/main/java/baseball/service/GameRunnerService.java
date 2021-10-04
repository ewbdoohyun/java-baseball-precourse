package baseball.service;

import baseball.utils.NumberChecker;
import nextstep.utils.Console;

public class GameRunnerService {

    public static final int WRONG_INPUT_NUM = 0;

    private final NumberGeneratorService numberGeneratorService;
    private final PrintTurnResultService printTurnResultService;

    public GameRunnerService() {
        numberGeneratorService = new NumberGeneratorService();
        printTurnResultService = new PrintTurnResultService();
    }

    public void startGame() {
        int baseballNum = numberGeneratorService.getNewNumber();
        int strikes,balls;
        do {
            int inputNum = readNumber();
            strikes = NumberChecker.calculateStrikes(baseballNum, inputNum);
            balls = NumberChecker.calculateBalls(baseballNum, inputNum);
            printTurnResultService.printResult(inputNum, strikes, balls);
        } while (strikes != 3);
        printTurnResultService.printGameEndResult();
    }

    private int readNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        try {
            int num = Integer.parseInt(Console.readLine());
            return validateBaseBallNumber(num);
        } catch (Exception e ) {
            return WRONG_INPUT_NUM;
        }
    }

    private int validateBaseBallNumber(int num) throws Exception {
        if (!NumberChecker.isValidBaseballNum(num)) {
            throw new Exception("번호 오류 ");
        }
        return num;
    }

}
