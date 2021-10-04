package baseball.service.model;

import baseball.utils.NumberChecker;
import nextstep.utils.Randoms;

public class NumberGeneratorService {

    /**
     * get new BaseBallNumber
     * @return 1부터 9까지 서로 다른 수로 이루어진 3자리의 수
     */
    public int getNewNumber() {
        int baseballNum;
        while(!NumberChecker.isValidBaseballNum(baseballNum= getNumber()));
        return baseballNum;
    }
    private int getNumber(){
        return Randoms.pickNumberInRange(1,9)*100+ Randoms.pickNumberInRange(1,9)*10+ Randoms.pickNumberInRange(1,9);
    }

}
