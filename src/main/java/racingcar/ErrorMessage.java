package racingcar;

public enum ErrorMessage {
    NULL_EXCEPTION("Null값을 입력할 수는 없습니다."),
    EMPTY_EXCEPTION("빈값을 입력할 수는 없습니다."),
    NAME_RANGE_EXCEPTION("이름은 5자 이하만 가능합니다."),
    TRY_COUNT_EXCEPTION("시도 횟수는 숫자만 입력가능합니다.");

    final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
