package com.example.kata.leap_year;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * 0, 음수, null을 입력하면 예외를 던진다.
 * 100으로 나누어지면 false를 반환한다.
 * 4로 나누어지면 true를 반환한다.
 * 400으로 나누어지면 true를 반환한다.
 * 4로 나누어지지 않으면 false를 반환한다.
 */
public class LeapYearTest {

    @Test
    @DisplayName("0, 음수, null을 입력하면 예외를 던진다.")
    public void case0() {
        assertThatThrownBy(() -> leapYear(0))
                .message()
                .isEqualTo("자연수만 입력할 수 있습니다.");
    }

    private void leapYear(final int year) {
        throw new IllegalStateException("LeapYearTest::leapYear not implemented yet");
    }
}
