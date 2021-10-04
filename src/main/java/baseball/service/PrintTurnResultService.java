package baseball.service;

import static baseball.service.GameRunnerService.WRONG_INPUT_NUM;

public class PrintTurnResultService {

    public static String WRONG_MESSAGE = "[ERROR] 올바른 값을 입력해 주세요. (1~9, 세자리)";
    public static String NOT_MATCH_MESSAGE = "낫싱";


    public void printResult(int inputNum, int strikes, int balls) {
        if (inputNum == WRONG_INPUT_NUM) {
            System.out.println(WRONG_MESSAGE);
        }else {
            printNormalResult(strikes,balls);
        }
    }
    private void printNormalResult(int strikes,int balls){
        if (strikes == 0 && balls == 0) {
            System.out.println(NOT_MATCH_MESSAGE);
        } else if (balls == 0) {
            System.out.println(strikes + "스트라이크");
        } else if (strikes == 0) {
            System.out.println(balls + "볼");
        } else {
            System.out.println(strikes + "스트라이크 " + balls + "볼");
        }
    }
    public void printGameEndResult() {
        System.out.println("3개의 숫자를 모두 맞췄습니다! 게임 끝");
    }
}
