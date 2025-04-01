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

    @Test
    @DisplayName("스코어가 1:3이면 Fifteen : Thirty로 표시된다.")
    public void case1() {
        assertThat(tennis(1, 3)).isEqualTo("Fifteen : Thirty");
        assertThat(tennis(3, 1)).isEqualTo("Thirty : Fifteen");
    }

    private String tennis(final int score1, final int score2) {
        if (0 == score1 && 0 == score2) return "Love : Love";
        return "";
    }
}
