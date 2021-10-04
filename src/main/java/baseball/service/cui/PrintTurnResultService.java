package baseball.service.cui;

import baseball.vo.GameResultVo;

public class PrintTurnResultService {

    public static String WRONG_MESSAGE = "[ERROR] 올바른 값을 입력해 주세요. (1~9, 세자리)";
    public static String NOT_MATCH_MESSAGE = "낫싱";

    /**
     * 결과 출력
     * @param resultVo 게임 결과 객체
     */
    public void printResult(GameResultVo resultVo) {
        if (!resultVo.isNormalGame()) {
            System.out.println(WRONG_MESSAGE);
        }else {
            printNormalResult(resultVo);
        }
        if(resultVo.getStrikes() == 3){
            printGameEndResult();
        }
    }

    private void printNormalResult(GameResultVo resultVo){
        if (resultVo.getStrikes() == 0 && resultVo.getBalls() == 0) {
            System.out.println(NOT_MATCH_MESSAGE);
        } else if (resultVo.getBalls() == 0) {
            System.out.println(resultVo.getStrikes() + "스트라이크");
        } else if (resultVo.getStrikes() == 0) {
            System.out.println(resultVo.getBalls() + "볼");
        } else {
            System.out.println(resultVo.getStrikes() + "스트라이크 " + resultVo.getBalls() + "볼");
        }
    }
    private void printGameEndResult() {
        System.out.println("3개의 숫자를 모두 맞췄습니다! 게임 끝");
    }
}
