package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"pobipobi", "dongtae"})
    void 입력값이_5글자_이상_일때_예외가_발생하는지(String name) {
        assertThrows(IllegalArgumentException.class,
                () -> Car.of(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"pobi", "dongt", "i", "hi", "yes"})
    void 입력값이_5글자_이하_일때_객체가_생성되는지(String name) {
        Car car = Car.of(name);
        assertThat(name).isNotNull();
    }
    @ParameterizedTest
    @ValueSource(ints = {4,5,6,7,8,9})
    void 입력값이_4_이상일때_이동한다(int number){
        Car car = Car.of("test");

        car.move(number);

        assertThat(car.currentMoveCount).isEqualTo(1);
    }
    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    void 입력값이_3_이하일때_정지한다(int number){
        Car car = Car.of("test");

        car.move(number);

        assertThat(car.currentMoveCount).isEqualTo(0);
    }


}
