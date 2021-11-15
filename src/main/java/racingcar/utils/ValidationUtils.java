package racingcar.utils;

import racingcar.exception.CarNameException;

public class ValidationUtils {

    public static final String CAR_LENGTH_ERROR_MSG = "자동차 이름은 1자 이상 5자 이하여야 합니다.";
    public static final String USER_INPUT_NUMBER_ERROR_MSG = "[ERROR] 이동 횟수는 1이상의 자연수이어야 합니다.";

    public static void validateCarNameLength(String carName) {
        if (1 <= carName.length() && carName.length() <= 5) {
            return;
        }
        throw new CarNameException(CAR_LENGTH_ERROR_MSG);
    }

    public static void validateUserInputNumber(int userInput) {
        if (0 < userInput) {
            return;
        }
        throw new IllegalArgumentException(USER_INPUT_NUMBER_ERROR_MSG);
    }
}
