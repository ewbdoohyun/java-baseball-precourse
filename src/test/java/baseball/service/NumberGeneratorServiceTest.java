package baseball.service;

import baseball.utils.NumberChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberGeneratorServiceTest {

    @Test
    void 번호발생_체크() {

        assertFalse(NumberChecker.isValidBaseballNum(102));
        assertFalse(NumberChecker.isValidBaseballNum(999));
        assertFalse(NumberChecker.isValidBaseballNum(122));
        assertFalse(NumberChecker.isValidBaseballNum(908));
        assertFalse(NumberChecker.isValidBaseballNum(988));
        assertTrue(NumberChecker.isValidBaseballNum(123));
        assertTrue(NumberChecker.isValidBaseballNum(275));

    }
}