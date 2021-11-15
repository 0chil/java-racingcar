package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {

    public static void printWinner(List<Car> winnerCarList) {
        StringBuilder printString = new StringBuilder();
        for (Car car : winnerCarList.subList(0, winnerCarList.size() - 1)) {
            printString.append(car.getName()).append(", ");
        }
        printString.append(winnerCarList.get(winnerCarList.size() - 1).getName());
        printString.append("가 최종 우승했습니다.");
        System.out.println(printString);
    }

    public static void printGameResultString(String gameResultString) {
        System.out.println("실행 결과\n" + gameResultString);
    }
}
