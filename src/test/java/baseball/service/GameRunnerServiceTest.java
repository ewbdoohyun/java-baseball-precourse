package baseball.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameRunnerServiceTest {

    private static GameRunnerService gameRunnerService;

    @BeforeAll
    static void 초기화(){
        gameRunnerService = new GameRunnerService();
    }

    @Test
    void 스트라이크_테스트() {
        assertEquals(gameRunnerService.calculateStrikes(123,123),3);
        assertEquals(gameRunnerService.calculateStrikes(123,234),0);

        assertEquals(gameRunnerService.calculateStrikes(123,144),1);
        assertEquals(gameRunnerService.calculateStrikes(123,321),1);
        assertEquals(gameRunnerService.calculateStrikes(123,213),1);

        assertEquals(gameRunnerService.calculateStrikes(234,235),2);
        assertEquals(gameRunnerService.calculateStrikes(135,235),2);
        assertEquals(gameRunnerService.calculateStrikes(215,235),2);
    }

    @Test
    void 볼_테스트() {
        assertEquals(gameRunnerService.calculateBalls(123,123),0);
        assertEquals(gameRunnerService.calculateBalls(123,456),0);
        assertEquals(gameRunnerService.calculateBalls(123,312),3);
        assertEquals(gameRunnerService.calculateBalls(123,231),3);

        assertEquals(gameRunnerService.calculateBalls(123,514),1);
        assertEquals(gameRunnerService.calculateBalls(123,541),1);
        assertEquals(gameRunnerService.calculateBalls(123,356),1);
        assertEquals(gameRunnerService.calculateBalls(123,536),1);
        assertEquals(gameRunnerService.calculateBalls(123,672),1);
        assertEquals(gameRunnerService.calculateBalls(123,276),1);

        assertEquals(gameRunnerService.calculateBalls(123,234),2);
        assertEquals(gameRunnerService.calculateBalls(123,512),2);
        assertEquals(gameRunnerService.calculateBalls(123,351),2);
    }

}