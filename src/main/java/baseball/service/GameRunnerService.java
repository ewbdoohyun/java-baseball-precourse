package baseball.service;

public class GameRunnerService {

    public int calculateStrike(int target,int input){
        int matchedCnt = 0;

        matchedCnt += (target / 100 == input / 100) ? 1 : 0;
        matchedCnt += (target % 100 / 10 == input % 100 / 10) ? 1 : 0;
        matchedCnt += (target % 10 == input % 10) ? 1 : 0;

        return matchedCnt;
    }

}
