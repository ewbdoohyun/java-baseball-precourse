package baseball.service;

import nextstep.utils.Randoms;

public class NumberBaseballGameService {

    public int getNewNumber(){
        int baseBallNum;
        while(!isValidBaseBallNum(baseBallNum= Randoms.pickNumberInRange(123,987)));
        return baseBallNum;
    }

    private boolean isValidBaseBallNum(int num){
        int hundredsNum = num/100;
        int tensNum = num%100/10;
        int unitsNum = num%10;
        if(hundredsNum == tensNum || tensNum == unitsNum || hundredsNum == unitsNum){
            return false;
        }
        return true;
    }
}
