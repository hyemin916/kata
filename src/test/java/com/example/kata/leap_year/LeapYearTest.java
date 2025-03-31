package com.example.kata.leap_year;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * 0, 음수, null을 입력하면 예외를 던진다.
 * 100으로 나누어지면 false를 반환한다.
 * 4로 나누어지면 true를 반환한다.
 * 400으로 나누어지면 true를 반환한다.
 * 4로 나누어지지 않으면 false를 반환한다.
 */
public class LeapYearTest {

    @Test
    @DisplayName("0, 음수를 입력하면 예외를 던진다.")
    public void case0() {
        assertThatThrownBy(() -> leapYear(0))
                .message()
                .isEqualTo("자연수만 입력할 수 있습니다.");
        assertThatThrownBy(() -> leapYear(-1))
                .message()
                .isEqualTo("자연수만 입력할 수 있습니다.");
    }

    @Test
    @DisplayName("100으로 나누어지면 false를 반환한다.")
    public void case1() {
        assertThat(leapYear(100)).isFalse();
        assertThat(leapYear(200)).isFalse();
        assertThat(leapYear(1000)).isFalse();
    }

    @Test
    @DisplayName("4로 나누어지면 true를 반환한다.")
    public void case2() {
        assertThat(leapYear(4)).isTrue();
        assertThat(leapYear(40)).isTrue();
        assertThat(leapYear(1996)).isTrue();
    }

    @Test
    @DisplayName("400으로 나누어지면 true를 반환한다.")
    public void case3() {
        assertThat(leapYear(400)).isTrue();
        assertThat(leapYear(800)).isTrue();
        assertThat(leapYear(2000)).isTrue();
    }

    private boolean leapYear(final int year) {
        if (0 == year || 0 > year)
            throw new IllegalStateException("자연수만 입력할 수 있습니다.");
        if (0 == year % 100) return false;
        return 0 == year % 4;
    }
}
