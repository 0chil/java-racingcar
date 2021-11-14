package racingcar.controller;

import org.junit.jupiter.api.Test;

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
        List<String> carNameList = Arrays.asList("나는자1동차!","나는자2동차!");

        // when
        carsController.addCars(carNameList);

        // then
        assertThat(carsController.getCarList().size()).isEqualTo(2);
        assertThat(carsController.getCarList().get(0).getName()).isEqualTo(carNameList.get(0));
        assertThat(carsController.getCarList().get(1).getName()).isEqualTo(carNameList.get(1));
    }
}
