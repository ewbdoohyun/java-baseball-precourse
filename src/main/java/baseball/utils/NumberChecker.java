package baseball.utils;

public class NumberChecker {

    private NumberChecker() {
    }

    public static int calculateStrikes(int target, int input) {
        int matchedCnt = 0;

        matchedCnt += (target / 100 == input / 100) ? 1 : 0;
        matchedCnt += (target % 100 / 10 == input % 100 / 10) ? 1 : 0;
        matchedCnt += (target % 10 == input % 10) ? 1 : 0;

        return matchedCnt;
    }

    public static int calculateBalls(int target, int input) {
        int matchedCnt = 0;

        matchedCnt += (isBall(target, input / 100, 3)) ? 1 : 0;
        matchedCnt += (isBall(target, input % 100 / 10, 2)) ? 1 : 0;
        matchedCnt += (isBall(target, input % 10, 1)) ? 1 : 0;

        return matchedCnt;
    }

    public static boolean isValidBaseballNum(int num) {
        if (num >= 1000 || num < 123) {
            return false;
        }
        int hundredsNum = num / 100;
        int tensNum = num % 100 / 10;
        int unitsNum = num % 10;
        if (hundredsNum == 0 || tensNum == 0 || unitsNum == 0) {
            return false;
        }
        return hundredsNum != tensNum && tensNum != unitsNum && hundredsNum != unitsNum;
    }


    /**
     * @param target 타겟이 되는 숫자
     * @param num    1~9까지의 값
     * @param digit  자릿수
     * @return
     */
    private static boolean isBall(int target, int num, int digit) {
        if (target / 100 == num && digit != 3) {
            return true;
        } else if (target % 100 / 10 == num && digit != 2) {
            return true;
        } else if (target % 10 == num && digit != 1) {
            return true;
        }

        return false;
    }
}
