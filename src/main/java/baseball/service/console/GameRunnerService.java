package baseball.service.console;

import baseball.service.cui.PrintTurnResultService;
import baseball.service.model.GameCalculatorService;
import baseball.service.model.NumberGeneratorService;
import baseball.utils.ConsoleInputUtils;
import baseball.utils.NumberChecker;
import baseball.vo.GameResultVo;

import java.util.NoSuchElementException;

public class GameRunnerService {

    public static final int WRONG_INPUT_NUM = -1;

    private final NumberGeneratorService numberGeneratorService;
    private final PrintTurnResultService printTurnResultService;
    private final GameCalculatorService gameCalculatorService;

    public GameRunnerService() {
        numberGeneratorService = new NumberGeneratorService();
        printTurnResultService = new PrintTurnResultService();
        gameCalculatorService = new GameCalculatorService();
    }

    public void startGame() {
        int baseballNum = numberGeneratorService.getNewNumber();
        GameResultVo resultVo;
        do {
            int inputNum = readNumber();
            resultVo  = gameCalculatorService.calculateGameResult(baseballNum,inputNum);
            printTurnResultService.printResult(resultVo);
        } while (resultVo.getStrikes() != 3);
    }

    private int readNumber() {
        try {
            return validateBaseBallNumber(ConsoleInputUtils.readInteger("숫자를 입력해주세요 : "));
        } catch (NoSuchElementException | IllegalStateException e ) {
            System.out.println("[ERROR] 비정상적 동작으로 서비스를 종료합니다.");
            throw e;
        }catch (NumberFormatException e){
            // 문자열 잘못 입력 받은것도 복구해서 사용하길 원하여 익셉션을 별도 값으로 처리
            return WRONG_INPUT_NUM;
        }
    }

    private int validateBaseBallNumber(int num) throws NumberFormatException {
        if (!NumberChecker.isValidBaseballNum(num)) {
            // 관리용 메세지
            throw new NumberFormatException("[ERROR] 잘못된 번호를 입력하였습니다.");
        }
        return num;
    }

}
