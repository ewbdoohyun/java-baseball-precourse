package baseball.util;

import baseball.utils.NumberChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerTest {
    @Test
    void 스트라이크_테스트() {
        assertEquals(NumberChecker.calculateStrikes(123,123),3);
        assertEquals(NumberChecker.calculateStrikes(123,234),0);

        assertEquals(NumberChecker.calculateStrikes(123,144),1);
        assertEquals(NumberChecker.calculateStrikes(123,321),1);
        assertEquals(NumberChecker.calculateStrikes(123,213),1);

        assertEquals(NumberChecker.calculateStrikes(234,235),2);
        assertEquals(NumberChecker.calculateStrikes(135,235),2);
        assertEquals(NumberChecker.calculateStrikes(215,235),2);
    }

    @Test
    void 볼_테스트() {
        assertEquals(NumberChecker.calculateBalls(123,123),0);
        assertEquals(NumberChecker.calculateBalls(123,456),0);
        assertEquals(NumberChecker.calculateBalls(123,312),3);
        assertEquals(NumberChecker.calculateBalls(123,231),3);

        assertEquals(NumberChecker.calculateBalls(123,514),1);
        assertEquals(NumberChecker.calculateBalls(123,541),1);
        assertEquals(NumberChecker.calculateBalls(123,356),1);
        assertEquals(NumberChecker.calculateBalls(123,536),1);
        assertEquals(NumberChecker.calculateBalls(123,672),1);
        assertEquals(NumberChecker.calculateBalls(123,276),1);

        assertEquals(NumberChecker.calculateBalls(123,234),2);
        assertEquals(NumberChecker.calculateBalls(123,512),2);
        assertEquals(NumberChecker.calculateBalls(123,351),2);
    }
}
