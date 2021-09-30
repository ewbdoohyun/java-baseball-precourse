package baseball.service;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class BaseballGameNumberServiceTest {

    @Test
    void 번호발생_체크() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BaseballGameNumberService baseballGameNumberService = new BaseballGameNumberService();
        Method method = baseballGameNumberService.getClass().getDeclaredMethod("isValidBaseBallNum",int.class);
        method.setAccessible(true);

        assertFalse((Boolean) method.invoke(baseballGameNumberService,100));
        assertFalse((Boolean) method.invoke(baseballGameNumberService,999));
        assertFalse((Boolean) method.invoke(baseballGameNumberService,122));
        assertFalse((Boolean) method.invoke(baseballGameNumberService,988));
        assertTrue((Boolean) method.invoke(baseballGameNumberService,123));
        assertTrue((Boolean) method.invoke(baseballGameNumberService,275));
    }
}