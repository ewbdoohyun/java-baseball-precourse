package baseball.service;

import baseball.utils.NumberChecker;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class NumberGeneratorServiceTest {

    @Test
    void 번호발생_체크() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        assertFalse(NumberChecker.isValidBaseBallNum(102));
        assertFalse(NumberChecker.isValidBaseBallNum(999));
        assertFalse(NumberChecker.isValidBaseBallNum(122));
        assertFalse(NumberChecker.isValidBaseBallNum(908));
        assertFalse(NumberChecker.isValidBaseBallNum(988));
        assertTrue(NumberChecker.isValidBaseBallNum(123));
        assertTrue(NumberChecker.isValidBaseBallNum(275));

    }
}