package racingcar.view;

import racingcar.utils.ValidationUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static final String CAR_NAME_INPUT_DELIMITER = ",";

    public static List<String> getUserCarNameInput(final Scanner scanner) {
        String userCarNameInput = scanner.next();
        List<String> carNameList = Arrays.asList(userCarNameInput.split(CAR_NAME_INPUT_DELIMITER));
        carNameList.forEach(ValidationUtils::validateCarNameLength);
        return carNameList;
    }


    public static int getUserIterateNumberInput(final Scanner scanner) {
        String userInputIterateNumber = scanner.next();
        ValidationUtils.validateUserInputNumberFormat(userInputIterateNumber);
        ValidationUtils.validateUserInputNumberRange(userInputIterateNumber);
        return Integer.parseInt(userInputIterateNumber);
    }
}
