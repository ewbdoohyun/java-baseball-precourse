package baseball.service;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class NumberGeneratorServiceTest {

    @Test
    void 번호발생_체크() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        NumberGeneratorService numberGeneratorService = new NumberGeneratorService();
        Method method = numberGeneratorService.getClass().getDeclaredMethod("isValidBaseBallNum",int.class);
        method.setAccessible(true);

        assertFalse((Boolean) method.invoke(numberGeneratorService,100));
        assertFalse((Boolean) method.invoke(numberGeneratorService,999));
        assertFalse((Boolean) method.invoke(numberGeneratorService,122));
        assertFalse((Boolean) method.invoke(numberGeneratorService,908));
        assertFalse((Boolean) method.invoke(numberGeneratorService,988));
        assertTrue((Boolean) method.invoke(numberGeneratorService,123));
        assertTrue((Boolean) method.invoke(numberGeneratorService,275));
    }
}