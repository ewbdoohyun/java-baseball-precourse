package baseball.service;

import nextstep.utils.Randoms;

public class NumberGeneratorService {

    public int getNewNumber() {
        int baseBallNum;
        while(!isValidBaseBallNum(baseBallNum= Randoms.pickNumberInRange(123,987)));
        return baseBallNum;
    }

    private boolean isValidBaseBallNum(int num) {
        int hundredsNum = num / 100;
        int tensNum = num % 100 / 10;
        int unitsNum = num % 10;
        if(hundredsNum == 0 || tensNum == 0 || unitsNum == 0){
            return false;
        }
        return hundredsNum != tensNum && tensNum != unitsNum && hundredsNum != unitsNum;
    }
}
