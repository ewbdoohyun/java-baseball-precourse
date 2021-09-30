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
        assertEquals(gameRunnerService.calculateStrike(123,123),3);
        assertEquals(gameRunnerService.calculateStrike(123,234),0);

        assertEquals(gameRunnerService.calculateStrike(123,144),1);
        assertEquals(gameRunnerService.calculateStrike(123,321),1);
        assertEquals(gameRunnerService.calculateStrike(123,213),1);

        assertEquals(gameRunnerService.calculateStrike(234,235),2);
        assertEquals(gameRunnerService.calculateStrike(135,235),2);
        assertEquals(gameRunnerService.calculateStrike(215,235),2);
    }
}