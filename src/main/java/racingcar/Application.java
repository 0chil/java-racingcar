package racingcar;

import racingcar.controller.GameController;
import racingcar.exception.CarNameException;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;
import java.util.Scanner;

public class Application {
    private static GameController gameController;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        gameController = new GameController();

        while(!inputCars(scanner));
        while(!inputIterateNumber(scanner));

        String gameResultString = gameController.runGame();

        printGameResult(gameResultString);
        printWinner();
    }

    public static boolean inputCars(final Scanner scanner) {
        List<String> carNameList;
        OutputView.printCarNameRequest();
        try {
            carNameList = InputView.getUserCarNameInput(scanner);
        } catch (CarNameException e) {
            System.out.println(e.getMessage());
            return false;
        }
        gameController.addCars(carNameList);
        return true;
    }

    public static boolean inputIterateNumber(final Scanner scanner) {
        int iterateNumber;
        OutputView.printIterateNumberRequest();
        try {
            iterateNumber = InputView.getUserIterateNumberInput(scanner);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return false;
        }
        gameController.setIterateNumber(iterateNumber);
        return true;
    }

    public static void printGameResult(String resultString) {
        OutputView.printGameResultString(resultString);
    }

    public static void printWinner() {
        OutputView.printWinner(gameController.getWinnerCarList());
    }
}
