package baseball.service;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class NumberBaseballGameServiceTest {

    @Test
    void 번호발생_체크() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        NumberBaseballGameService numberBaseballGameService = new NumberBaseballGameService();
        Method method = numberBaseballGameService.getClass().getDeclaredMethod("isValidBaseBallNum",int.class);
        method.setAccessible(true);

        assertFalse((Boolean) method.invoke(numberBaseballGameService,100));
        assertFalse((Boolean) method.invoke(numberBaseballGameService,999));
        assertFalse((Boolean) method.invoke(numberBaseballGameService,122));
        assertFalse((Boolean) method.invoke(numberBaseballGameService,988));
        assertTrue((Boolean) method.invoke(numberBaseballGameService,123));
        assertTrue((Boolean) method.invoke(numberBaseballGameService,275));
    }
}