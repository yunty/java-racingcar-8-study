package racingcar;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void 예외가_발생하는지(String name){
        assertThrows(IllegalArgumentException.class,
                () -> Car.of(name));
    }// 지정한 예외가 발생하는지

}
