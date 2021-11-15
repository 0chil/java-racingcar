package racingcar;

import racingcar.controller.GameController;
import racingcar.domain.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;
import java.util.Scanner;

public class Application {
    private static GameController gameController;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        gameController = new GameController();
        OutputView.printCarNameRequest();
        inputCars(scanner);
        OutputView.printIterateNumberRequest();
        inputIterateNumber(scanner);

        gameController.runGame();

        printGameResult();
        printWinner();
    }

    public static void inputCars(final Scanner scanner){
        List<String> carNameList = InputView.getUserCarNameInput(scanner);
        gameController.addCars(carNameList);
    }

    public static void inputIterateNumber(final Scanner scanner){
        int iterateNumber = InputView.getUserIterateNumberInput(scanner);
        gameController.setIterateNumber(iterateNumber);
    }

    public static void printGameResult(){
        OutputView.printGameResultString(gameController.toString());
    }

    public static void printWinner(){
        OutputView.printWinner(gameController.getWinnerCarList());
    }
}
