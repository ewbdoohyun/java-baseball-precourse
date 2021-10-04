package baseball.utils;

public class NumberChecker {

    private NumberChecker() {
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
}
