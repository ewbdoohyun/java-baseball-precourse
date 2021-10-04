package baseball.service.console;

import baseball.utils.ConsoleInputUtils;

import java.util.NoSuchElementException;

import static baseball.service.console.GameRunnerService.WRONG_INPUT_NUM;

public class GameRetryService {

    private static final int RETRY_VALUE = 1;
    public static final int EXIT_VALUE = 2;

    public int isRetry() {
        int retryNum;
        do {
            retryNum = getValidRetryNum();
        } while (!isRetryMagicNumber(retryNum));
        return retryNum;
    }
    private int getValidRetryNum(){
        int num = getRetryNum();
        if(!isRetryMagicNumber(num)){
            printInvalid();
        }
        return num;
    }
    private boolean isRetryMagicNumber(int num){
        if( RETRY_VALUE == num  || EXIT_VALUE == num ){
            return true;
        }
        return false;
    }

    private void printInvalid(){
        System.out.println("[ERROR] 올바른 값을 입력해 주세요. (1 or 2)");
    }

    private int getRetryNum() {
        try {
            return ConsoleInputUtils.readInteger("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
        } catch (NoSuchElementException | IllegalStateException e ) {
            System.out.println("[ERROR] 비정상적 동작으로 서비스를 종료합니다.");
            throw e;
        }catch (NumberFormatException e){
            System.out.println("[ERROR] 올바른 값을 입력해 주세요. (1 or 2)");
            return WRONG_INPUT_NUM;
        }
    }

}
