package baseball.service.model;

import baseball.utils.NumberChecker;
import baseball.vo.GameResultVo;

import static baseball.service.console.GameRunnerService.WRONG_INPUT_NUM;


public class GameCalculatorService {

    public GameResultVo calculateGameResult(int baseballNum,int inputNum){
        if(inputNum == WRONG_INPUT_NUM){
            return GameResultVo.getFailGame();
        }
        int strikes = NumberChecker.calculateStrikes(baseballNum, inputNum);
        int balls = NumberChecker.calculateBalls(baseballNum, inputNum);
        return new GameResultVo(strikes,balls);
    }
}
