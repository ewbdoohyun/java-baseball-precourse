package baseball.utils;

import nextstep.utils.Console;

import java.util.NoSuchElementException;

public class ConsoleInputUtils {
    /**
     * msg 필요할시
     * @param previewMsg not null, not new line
     * @return
     * @throws NumberFormatException
     * @throws NoSuchElementException scanner.nexLine()중 발생하는 예외
     * @throws IllegalStateException  scanner.nexLine()중 발생하는 예외
     */
    public static int readInteger(String previewMsg){
        System.out.print(previewMsg);
        return Integer.parseInt(Console.readLine());
    }
}
