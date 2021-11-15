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

    public static void printCarNameRequest(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printIterateNumberRequest(){
        System.out.println("시도할 회수는 몇회인가요?");
    }
}
