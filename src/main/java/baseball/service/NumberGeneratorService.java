package baseball.service;

import baseball.utils.NumberChecker;
import nextstep.utils.Randoms;

public class NumberGeneratorService {

    public int getNewNumber() {
        int baseballNum;
        while(!NumberChecker.isValidBaseballNum(baseballNum= getNumber()));
        return baseballNum;
    }
    private int getNumber(){
        return Randoms.pickNumberInRange(1,9)*100+ Randoms.pickNumberInRange(1,9)*10+ Randoms.pickNumberInRange(1,9);
    }

}
