package baseball.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static baseball.service.GameRunnerService.WRONG_INPUT_NUM;
import static baseball.service.PrintTurnResultService.NOT_MATCH_MESSAGE;
import static baseball.service.PrintTurnResultService.WRONG_MESSAGE;
import static org.junit.jupiter.api.Assertions.*;

class PrintTurnResultServiceTest {

    PrintTurnResultService printTurnResultService;
    final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    final PrintStream standardOut = System.out;

    @BeforeEach
    void init(){
        printTurnResultService = new PrintTurnResultService();
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }


    @Test
    void printWrongResult() {
        printTurnResultService.printResult(WRONG_INPUT_NUM,2,3);
        assertEquals(outputStreamCaptor.toString().trim(),WRONG_MESSAGE);
    }
    @Test
    void printNotMatch(){
        printTurnResultService.printResult(123,0,0);
        assertEquals(outputStreamCaptor.toString().trim(),NOT_MATCH_MESSAGE);
    }
    @Test
    void printStrikeResult() {
        printTurnResultService.printResult(123,1,0);
        assertEquals(outputStreamCaptor.toString().trim(),"1스트라이크");
    }
    @Test
    void printBallResult() {
        printTurnResultService.printResult(123,0,1);
        assertEquals(outputStreamCaptor.toString().trim(),"1볼");
    }
    @Test
    void printBallAndStrike(){
        printTurnResultService.printResult(123,2,1);
        assertEquals(outputStreamCaptor.toString().trim(),"2스트라이크 1볼");
    }

}