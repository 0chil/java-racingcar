package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.exception.CarNameException;

public class ValidationUtilsTest {

    @Test
    void 자동차_이름_5자_초과() {
        // given, when, then
        Assertions.assertThatExceptionOfType(CarNameException.class).isThrownBy(() -> {
            ValidationUtils.validateCarNameLength("나는자동차다!");
        });
    }

    @Test
    void 자동차_이름_공백() {
        // given, when, then
        Assertions.assertThatExceptionOfType(CarNameException.class).isThrownBy(() -> {
            ValidationUtils.validateCarNameLength("");
        });
    }

    @Test
    void 사용자_입력_이동횟수_음수() {
        // given, when, then
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            ValidationUtils.validateUserInputNumberRange("-1");
        });
    }

    @Test
    void 사용자_입력_이동횟수_0() {
        // given, when, then
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            ValidationUtils.validateUserInputNumberRange("0");
        });
    }

    @Test
    void 사용자_입력_이동횟수_문자() {
        // given, when, then
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            ValidationUtils.validateUserInputNumberFormat("a");
        });
    }

    @Test
    void 사용자_입력_이동횟수_문자열() {
        // given, when, then
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            ValidationUtils.validateUserInputNumberFormat("ㅁㄴㅇㄹ");
        });
    }


}
