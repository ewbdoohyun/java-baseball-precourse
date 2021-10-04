package baseball.vo;

public class GameResultVo {
    private int strikes;
    private int balls;
    /**
     * false일 시 잘못된 게임
     */
    private boolean isNormalGame;

    public GameResultVo(int strikes,int balls) {
        this.strikes = strikes;
        this.balls = balls;
        this.isNormalGame = true;
    }
    private GameResultVo(){
        this.isNormalGame = false;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }
    public boolean isNormalGame(){
        return isNormalGame;
    }

    public static GameResultVo getFailGame(){
        return new GameResultVo();
    }
}
