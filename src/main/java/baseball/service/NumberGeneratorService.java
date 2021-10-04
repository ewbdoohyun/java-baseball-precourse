package baseball.service;

import baseball.utils.NumberChecker;
import nextstep.utils.Randoms;

public class NumberGeneratorService {

    public int getNewNumber() {
        int baseballNum;
        while(!NumberChecker.isValidBaseballNum(baseballNum= Randoms.pickNumberInRange(123,987)));
        return baseballNum;
    }

}
