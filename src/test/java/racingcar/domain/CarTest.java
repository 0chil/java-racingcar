package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    public static final String TEST_CAR_NAME = "자동차 이름 붙이기!";
    private static Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void 자동차_전진() {
        // given, when
        car.moveForward();
        car.moveForward();
        car.moveForward();

        // then
        assertThat(car.getLocation()).isEqualTo(3);
    }

    @Test
    void 자동차_이름_붙이기() {
        // given, when
        car.setName(TEST_CAR_NAME);

        // then
        assertThat(car.getName()).isEqualTo(TEST_CAR_NAME);
    }

    @ParameterizedTest(name = "자동차_값_입력_{arguments}_멈춤")
    @ValueSource(ints = {0, 3})
    void 자동차_랜덤값_입력_멈춤(int randomizedNumber) {
        // given, when
        int previousLocation = car.getLocation();
        car.moveByNumber(randomizedNumber);

        // then
        assertThat(car.getLocation()).isEqualTo(previousLocation);
    }

    @ParameterizedTest(name = "자동차_값_입력_{arguments}_전진")
    @ValueSource(ints = {4, 9})
    void 자동차_랜덤값_입력_전진(int randomizedNumber) {
        // given, when
        int previousLocation = car.getLocation();
        car.moveByNumber(randomizedNumber);

        // then
        assertThat(car.getLocation()).isGreaterThan(previousLocation);
    }

    @Test
    void 자동차_문자열_표현() {
        // given, when
        car.setName("자1동차!");
        car.setLocation(4);

        // then
        assertThat(car.toString()).isEqualTo("자1동차! : ----");

        // when
        car.setLocation(0);

        // then
        assertThat(car.toString()).isEqualTo("자1동차! : ");
    }
}
