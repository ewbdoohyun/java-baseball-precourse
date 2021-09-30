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
}