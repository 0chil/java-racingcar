package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_전진(){
        // given
        Car car = new Car();

        // when
        car.moveForward();
        car.moveForward();
        car.moveForward();

        // then
        Assertions.assertThat(car.getLocation()).isEqualTo(3);
    }

    @Test
    void 자동차_이름_붙이기(){
        // given
        Car car = new Car();

        // when
        car.setName("자동차 이름 붙이기!");

        // then
        Assertions.assertThat(car.getName()).isEqualTo("자동차 이름 붙이기!");
    }
}
