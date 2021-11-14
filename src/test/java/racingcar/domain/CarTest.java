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
}
