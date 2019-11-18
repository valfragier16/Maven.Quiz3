package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        RockPaperScissorHandSign result = null;
        switch (this) {
            case ROCK:
                result = PAPER;
                break;
            case PAPER:
                result = SCISSOR;
                break;
            case SCISSOR:
                result = ROCK;
                break;
        }
        return result;
    }

    public RockPaperScissorHandSign getLoser() {
        RockPaperScissorHandSign result = null;
        switch (this){
            case ROCK:
                result = SCISSOR;
                break;
            case PAPER:
                result = ROCK;
                break;
            case SCISSOR:
                result = PAPER;
                break;
        }
        return result;
    }
}
