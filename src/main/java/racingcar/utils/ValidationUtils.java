package racingcar.utils;

import racingcar.exception.CarNameException;

public class ValidationUtils {

    public static void validateCarNameLength(String s) {
        if (1 <= s.length() && s.length() <= 5) {
            return;
        }
        throw new CarNameException("자동차 이름은 1자 이상 5자 이하여야 합니다.");
    }
}
