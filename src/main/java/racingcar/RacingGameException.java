package racingcar;

public class RacingGameException extends IllegalArgumentException {
    public RacingGameException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
    }
}
