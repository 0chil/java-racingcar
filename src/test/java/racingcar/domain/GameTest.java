package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    void 게임_횟수_지정(){
        // given
        Game game = new Game();

        // when
        game.setIterateNumber(9);

        // then
        Assertions.assertThat(game.getIterateNumber()).isEqualTo(9);
    }
}
