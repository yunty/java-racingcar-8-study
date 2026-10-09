package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    List<Car> cars;

    private Cars(String[] names) {
        cars = new ArrayList<>();
        addList(names);
    }

    public static Cars of(String[] names) {
        return new Cars(names);
    }

    public void carsMoveByRandomNumber() {
        cars.forEach(this::moveByRandomNumber);
    }

    private void moveByRandomNumber(Car car) {
        car.move(RandomNumberGenerator.generate());
    }

    private void addList(String[] names) {
        Arrays.stream(names)
                .map(Car::of)
                .forEach(this::add);
    }

    private void add(Car car) {
        cars.add(car);
    }

}
