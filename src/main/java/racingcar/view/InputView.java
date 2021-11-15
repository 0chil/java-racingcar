package racingcar.view;

import racingcar.domain.Car;
import racingcar.utils.ValidationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static List<Car> getUserCarNameInput(final Scanner scanner) {
        List<Car> carList = new ArrayList<>();
        String userCarNameInput = scanner.next();
        List<String> carNameList = Arrays.asList(userCarNameInput.split(","));
        carNameList.forEach(carName -> {
            ValidationUtils.validateCarNameLength(carName);
            carList.add(new Car(carName));
        });
        return carList;
    }


    public static int getUserIterateNumberInput(final Scanner scanner) {
        int userInputIterateNumber = scanner.nextInt();
        ValidationUtils.validateUserInputNumber(userInputIterateNumber);
        return userInputIterateNumber;
    }
}
