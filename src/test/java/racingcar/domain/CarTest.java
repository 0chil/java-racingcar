package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    public static final String TEST_CAR_NAME = "자동차 이름 붙이기!";
    private static Car car;

    @BeforeEach
    void setUp(){
        car = new Car();
    }

    @Test
    void 자동차_전진(){
        // given

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

        // when
        car.setName(TEST_CAR_NAME);

        // then
        Assertions.assertThat(car.getName()).isEqualTo(TEST_CAR_NAME);
    }
}
