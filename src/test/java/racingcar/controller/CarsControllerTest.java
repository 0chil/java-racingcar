package racingcar.controller;

import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsControllerTest {

    @Test
    void 자동차_N대_생성() {
        // given
        CarsController carsController = new CarsController();

        // when
        carsController.addCars(5);

        // then
        assertThat(carsController.getCarList().size()).isEqualTo(5);
    }

    @Test
    void 자동차_이름으로_생성() {
        // given
        CarsController carsController = new CarsController();
        List<String> carNameList = Arrays.asList("자1동차", "자2동차");

        // when
        carsController.addCars(carNameList);

        // then
        assertThat(carsController.getCarList().size()).isEqualTo(2);
        assertThat(carsController.getCarList().get(0).getName()).isEqualTo(carNameList.get(0));
        assertThat(carsController.getCarList().get(1).getName()).isEqualTo(carNameList.get(1));
    }

    @Test
    void 모든_자동차_랜덤값으로_전진() {
        // given
        CarsController carsController = new CarsController();
        List<String> carNameList = Arrays.asList("자1동차", "자2동차", "자3동차", "자4동차", "자5동차");
        carsController.addCars(carNameList);
        int lastCarIndex = carsController.getCarList().size() - 1;
        int[] previousLocation = {carsController.getCarList().get(0).getLocation(), carsController.getCarList().get(lastCarIndex).getLocation()};

        // when
        carsController.moveCarsByRandomNumber(4, 9);

        // then
        assertThat(carsController.getCarList().get(0).getLocation()).isGreaterThan(previousLocation[0]);
        assertThat(carsController.getCarList().get(lastCarIndex).getLocation()).isGreaterThan(previousLocation[1]);
    }

    @Test
    void 모든_자동차_랜덤값으로_정지() {
        // given
        CarsController carsController = new CarsController();
        List<String> carNameList = Arrays.asList("자1동차", "자2동차", "자3동차", "자4동차", "자5동차");
        carsController.addCars(carNameList);
        int lastCarIndex = carsController.getCarList().size() - 1;
        int[] previousLocation = {carsController.getCarList().get(0).getLocation(), carsController.getCarList().get(lastCarIndex).getLocation()};

        // when
        carsController.moveCarsByRandomNumber(0, 3);

        // then
        assertThat(carsController.getCarList().get(0).getLocation()).isEqualTo(previousLocation[0]);
        assertThat(carsController.getCarList().get(lastCarIndex).getLocation()).isEqualTo(previousLocation[1]);
    }
}
