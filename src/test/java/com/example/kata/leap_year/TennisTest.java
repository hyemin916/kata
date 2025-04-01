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
        String score1Name = "";
        String score2Name = "";
        if (0 == score1) score1Name = "Love";
        if (1 == score1) score1Name = "Fifteen";
        if (2 == score1) score1Name = "Thirty";
        if (0 == score2) score2Name = "Love";
        if (1 == score2) score2Name = "Fifteen";
        if (2 == score2) score2Name = "Thirty";
        return score1Name + " : " + score2Name;
    }
}
