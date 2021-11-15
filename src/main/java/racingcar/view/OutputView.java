package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {

    public static final String WINNER_POSTFIX_MSG = "가 최종 우승했습니다.";
    public static final String WINNER_CAR_NAME_DELIMITER = ", ";
    public static final String GAME_RESULT_PREFIX_MSG = "실행 결과\n";
    public static final String CAR_NAME_REQUEST_MSG = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String ITERATE_NUMBER_REQUEST_MSG = "시도할 회수는 몇회인가요?";

    public static void printWinner(List<Car> winnerCarList) {
        StringBuilder printString = new StringBuilder();
        for (Car car : winnerCarList.subList(0, winnerCarList.size() - 1)) {
            printString.append(car.getName()).append(WINNER_CAR_NAME_DELIMITER);
        }
        printString.append(winnerCarList.get(winnerCarList.size() - 1).getName());
        printString.append(WINNER_POSTFIX_MSG);
        System.out.println(printString);
    }

    public static void printGameResultString(String gameResultString) {
        System.out.print(GAME_RESULT_PREFIX_MSG + gameResultString);
    }

    public static void printCarNameRequest() {
        System.out.println(CAR_NAME_REQUEST_MSG);
    }

    public static void printIterateNumberRequest() {
        System.out.println(ITERATE_NUMBER_REQUEST_MSG);
    }
}
