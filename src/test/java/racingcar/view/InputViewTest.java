package racingcar.view;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {

    @Test
    void 사용자_자동차_입력() {
        // given
        final Scanner scanner = new Scanner("자1동차,자2동차,자3동차\n");

        // when
        List<Car> carList = InputView.getUserCarNameInput(scanner);

        //then
        assertThat(carList.size()).isEqualTo(3);
        assertThat(carList.get(0).getName()).isEqualTo("자1동차");
        assertThat(carList.get(2).getName()).isEqualTo("자3동차");
    }

    @Test
    void 사용자_이동횟수_입력(){
        // given
        final Scanner scanner = new Scanner("3\n");

        // when
        int userInputIterateNumber = InputView.getUserIterateNumberInput(scanner);

        // then
        assertThat(userInputIterateNumber).isEqualTo(3);
    }
}
