package racingcar.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarControllerTest {

    @Test
    void 자동차_N대_생성(){
        // given
        CarsController carsController = new CarsController();

        // when
        carsController.addCars(5);

        // then
        assertThat(carsController.getCarList().size()).isEqualTo(5);
    }
}
