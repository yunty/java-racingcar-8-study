package racingcar;

public class Car {
    String name;
    int currentMoveCount;

    private Car(String name) {
        validate(name);
        this.name = name;
        this.currentMoveCount = 0;
    }

    public static Car of(String name) {
        return new Car(name);
    }


    private void validate(String name) {
        validateIsNull(name);
        validateisNameBlank(name);
        validateNameRange(name);
    }

    private void validateIsNull(String name) {
        if (name == null) {
            throw new RacingGameException(ErrorMessage.NULL_EXCEPTION);
        }
    }

    private static void validateisNameBlank(String name) {
        if (name.isBlank()) {
            throw new RacingGameException(ErrorMessage.EMPTY_EXCEPTION);
        }
    }

    private static void validateNameRange(String name) {
        if (name.length() > 5) {
            throw new RacingGameException(ErrorMessage.NAME_RANGE_EXCEPTION);
        }
    }
}
