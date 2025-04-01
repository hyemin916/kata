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
    @DisplayName("스코어가 1:2이면 Fifteen : Thirty로 표시된다.")
    public void case1() {
        assertThat(tennis(1, 2)).isEqualTo("Fifteen : Thirty");
        assertThat(tennis(2, 1)).isEqualTo("Thirty : Fifteen");
    }

    private String tennis(final int score1, final int score2) {
        return printScore(score1) + " : " + printScore(score2);
    }

    private String printScore(final int score1) {
        if (0 == score1) return "Love";
        if (1 == score1) return "Fifteen";
        if (2 == score1) return "Thirty";
        return "";
    }
}
