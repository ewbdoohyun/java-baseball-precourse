package baseball.service;

import baseball.utils.NumberChecker;
import nextstep.utils.Randoms;

public class NumberGeneratorService {

    public int getNewNumber() {
        int baseBallNum;
        while(!NumberChecker.isValidBaseBallNum(baseBallNum= Randoms.pickNumberInRange(123,987)));
        return baseBallNum;
    }

}
