package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    private static final int startNumber = 0;
    private static final int endNumber = 9;

    public static int generate() {
        return Randoms.pickNumberInRange(startNumber, endNumber);
    }
}
