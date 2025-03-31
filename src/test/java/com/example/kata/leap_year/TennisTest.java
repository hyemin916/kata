package com.example.kata.leap_year;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {
    @Test
    @DisplayName("스코어가 0:0이면 Love : Love로 표시된다.")
    public void case0() {
        assertThat(tennis(0, 0)).isEqualTo("Love : Love");
    }

    private String tennis(final int score1, final int score2) {
        return "";
    }
}
