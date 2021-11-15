package racingcar.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.controller.GameController;
import racingcar.domain.Car;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OutputViewTest {
    private GameController gameController;

    @BeforeEach
    void setUp() {
        gameController = new GameController();
    }

    @Test
    void 우승자_출력_1명() {
        // given
        ByteArrayOutputStream outputStream = getOutputStream();
        gameController.addCars(Collections.singletonList("자1동차!"));

        List<Car> winnerCarList = gameController.getWinnerCarList();

        // when
        OutputView.printWinner(winnerCarList);

        // then
        assertThat(outputStream.toString()).contains("자1동차!가 최종 우승했습니다.");
    }

    @Test
    void 우승자_출력_2명이상() {
        // given
        ByteArrayOutputStream outputStream = getOutputStream();
        gameController.addCars(Arrays.asList("자1동차!", "자2동차!"));
        List<Car> winnerCarList = gameController.getWinnerCarList();

        // when
        OutputView.printWinner(winnerCarList);

        // then
        assertThat(outputStream.toString()).contains("자1동차!, 자2동차!가 최종 우승했습니다.");
    }

    @Test
    void 게임_실행결과_출력() {
        // given
        ByteArrayOutputStream outputStream = getOutputStream();
        gameController.addCars(Arrays.asList("자1동차!", "자2동차!"));
        gameController.setIterateNumber(10);
        String gameResultString = gameController.runGame();

        // when
        OutputView.printGameResultString(gameResultString);
        OutputView.printWinner(gameController.getWinnerCarList());

        // then
        assertThat(outputStream.toString()).contains("실행 결과");
        assertThat(outputStream.toString()).contains("자1동차! : ");
        assertThat(outputStream.toString()).contains("자2동차! : ");
    }

    private ByteArrayOutputStream getOutputStream(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        return outputStream;
    }
}
