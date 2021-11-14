package racingcar.utils;

import racingcar.exception.CarNameException;

public class ValidationUtils {

    public static final String CAR_LENGTH_ERROR_MSG = "자동차 이름은 1자 이상 5자 이하여야 합니다.";

    public static void validateCarNameLength(String carName) {
        if (1 <= carName.length() && carName.length() <= 5) {
            return;
        }
        throw new CarNameException(CAR_LENGTH_ERROR_MSG);
    }
}
