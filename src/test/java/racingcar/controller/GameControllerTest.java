package racingcar.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Game;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameControllerTest {
    private GameController gameController;

    @BeforeEach
    void setUp() {
        this.gameController = new GameController();
    }

    @Test
    void 자동차_N대_생성() {
        // given, when
        gameController.addCars(5);

        // then
        assertThat(gameController.getGame().getCarList().size()).isEqualTo(5);
    }

    @Test
    void 자동차_이름으로_생성() {
        // given
        List<String> carNameList = Arrays.asList("자1동차", "자2동차");

        // when
        gameController.addCars(carNameList);

        // then
        assertThat(gameController.getGame().getCarList().size()).isEqualTo(2);
        assertThat(gameController.getGame().getCarList().get(0).getName()).isEqualTo(carNameList.get(0));
        assertThat(gameController.getGame().getCarList().get(1).getName()).isEqualTo(carNameList.get(1));
    }

    @Test
    void 모든_자동차_랜덤값으로_전진() {
        // given
        List<String> carNameList = Arrays.asList("자1동차", "자2동차", "자3동차", "자4동차", "자5동차");
        gameController.addCars(carNameList);
        int lastCarIndex = gameController.getGame().getCarList().size() - 1;
        int[] previousLocation = {gameController.getGame().getCarList().get(0).getLocation(), gameController.getGame().getCarList().get(lastCarIndex).getLocation()};

        // when
        gameController.moveCarsByRandomNumber(4, 9);

        // then
        assertThat(gameController.getGame().getCarList().get(0).getLocation()).isGreaterThan(previousLocation[0]);
        assertThat(gameController.getGame().getCarList().get(lastCarIndex).getLocation()).isGreaterThan(previousLocation[1]);
    }

    @Test
    void 모든_자동차_랜덤값으로_정지() {
        // given
        List<String> carNameList = Arrays.asList("자1동차", "자2동차", "자3동차", "자4동차", "자5동차");
        gameController.addCars(carNameList);
        int lastCarIndex = gameController.getGame().getCarList().size() - 1;
        int[] previousLocation = {gameController.getGame().getCarList().get(0).getLocation(), gameController.getGame().getCarList().get(lastCarIndex).getLocation()};

        // when
        gameController.moveCarsByRandomNumber(1, 3);

        // then
        assertThat(gameController.getGame().getCarList().get(0).getLocation()).isEqualTo(previousLocation[0]);
        assertThat(gameController.getGame().getCarList().get(lastCarIndex).getLocation()).isEqualTo(previousLocation[1]);
    }

    @Test
    void 게임_횟수_지정() {
        // given, when
        gameController.setIterateNumber(9);

        // then
        Assertions.assertThat(gameController.getIterateNumber()).isEqualTo(9);
    }

    @Test
    void 지정된_이동횟수만큼_게임실행(){
        // given, when
        List<String> carNameList = Arrays.asList("자1동차", "자2동차", "자3동차", "자4동차", "자5동차");
        gameController.addCars(carNameList);
        gameController.setIterateNumber(5);
        gameController.runGame();

        // then
        assertThat(gameController.getIterateNumber()).isEqualTo(0);
    }

    @Test
    void 우승자_판정(){
        // given, when
        List<String> carNameList = Arrays.asList("자1동차", "자2동차", "자3동차", "자4동차", "자5동차");
        gameController.addCars(carNameList);
        gameController.setIterateNumber(5);
        gameController.runGame();

        List<Car> winnerList = gameController.getWinnerCarList();

        assertThat(winnerList.size()).isNotZero();
    }
}
