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

    @Test
    @DisplayName("스코어가 3:3이면 Deuce로 표시된다.")
    public void case2() {
        assertThat(tennis(3, 3)).isEqualTo("Deuce");
    }

    @Test
    @DisplayName("스코어가 4:3이면 Advantage로 표시된다.")
    public void case3() {
        assertThat(tennis(4, 3)).isEqualTo("Advantage");
        assertThat(tennis(3, 4)).isEqualTo("Advantage");
    }

    @Test
    @DisplayName("스코어가 4:4이면 Deuce로 표시된다.")
    public void case4() {
        assertThat(tennis(4, 4)).isEqualTo("Deuce");
    }

    @Test
    @DisplayName("스코어가 4:2이면 A Win, 2:4이면 B Win으로 표시된다.")
    public void case5() {
        assertThat(tennis(4, 2)).isEqualTo("A Win");
        assertThat(tennis(2, 4)).isEqualTo("B Win");
    }

    private String tennis(final int score1, final int score2) {
        if (3 <= score1 && 3 <= score2 && score1 == score2) return "Deuce";
        if (3 <= score1 && 3 <= score2 && 1 == Math.abs(score1 - score2)) return "Advantage";
        return printScore(score1) + " : " + printScore(score2);
    }

    private String printScore(final int score1) {
        if (0 == score1) return "Love";
        if (1 == score1) return "Fifteen";
        if (2 == score1) return "Thirty";
        return "";
    }
}
