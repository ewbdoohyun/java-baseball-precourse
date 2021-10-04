package baseball.service;

import nextstep.utils.Console;

import static baseball.service.GameRunnerService.WRONG_INPUT_NUM;

public class GameRetryService {

    public int isRetry() {
        int retryNum;
        do {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            retryNum = getRetryNum();
        } while (0 >= retryNum || retryNum > 2);
        return retryNum;
    }

    private int getRetryNum() {
        int num ;
        try {
            num = Integer.parseInt(Console.readLine());
        } catch (Exception e) {
            System.out.println("[ERROR] 올바른 값을 입력해 주세요. (1 or 2)");
            return WRONG_INPUT_NUM;
        }
        if(0 >= num || num > 2){
            System.out.println("[ERROR] 올바른 값을 입력해 주세요. (1 or 2)");
        }
        return num;
    }
}
