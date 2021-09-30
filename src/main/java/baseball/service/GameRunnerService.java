package baseball.service;

public class GameRunnerService {

    public int calculateStrikes(int target, int input){
        int matchedCnt = 0;

        matchedCnt += (target / 100 == input / 100) ? 1 : 0;
        matchedCnt += (target % 100 / 10 == input % 100 / 10) ? 1 : 0;
        matchedCnt += (target % 10 == input % 10) ? 1 : 0;

        return matchedCnt;
    }

    public int calculateBalls(int target,int input){
        int matchedCnt = 0;

        matchedCnt += (isBall(target,input/100,3))?1:0;
        matchedCnt += (isBall(target,input%100/10,2))?1:0;
        matchedCnt += (isBall(target,input%10,1))?1:0;

        return matchedCnt;
    }

    /**
     *
     * @param target 타겟이 되는 숫자
     * @param num  1~9까지의 값
     * @param digit 자릿수
     * @return
     */
    private boolean isBall(int target,int num, int digit){
        if(target/100 == num && digit !=3){
            return true;
        }else if(target%100/10 == num && digit != 2){
            return true;
        }else if(target%10 == num && digit != 1){
            return true;
        }

        return false;
    }
}
