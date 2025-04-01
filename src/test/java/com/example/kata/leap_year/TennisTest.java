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
    @DisplayName("각 플레이어의 점수가 3점 이상이고 동점이면 Deuce로 표시된다.")
    public void case2() {
        assertThat(tennis(3, 3)).isEqualTo("Deuce");
        assertThat(tennis(4, 4)).isEqualTo("Deuce");
        assertThat(tennis(5, 5)).isEqualTo("Deuce");
        assertThat(tennis(6, 6)).isEqualTo("Deuce");
    }

    @Test
    @DisplayName("각 플레이어의 점수가 3점 이상이고 1점차가 나면 Advantage로 표시된다.")
    public void case3() {
        assertThat(tennis(4, 3)).isEqualTo("Advantage");
        assertThat(tennis(3, 4)).isEqualTo("Advantage");
        assertThat(tennis(4, 5)).isEqualTo("Advantage");
        assertThat(tennis(5, 4)).isEqualTo("Advantage");
        assertThat(tennis(6, 5)).isEqualTo("Advantage");
        assertThat(tennis(5, 6)).isEqualTo("Advantage");
    }

    @Test
    @DisplayName("한 플레이어의 점수가 4점 이상이고 상대편 플레이어보다 2점 높으면 승리한다.")
    public void case5() {
        assertThat(tennis(4, 2)).isEqualTo("A Win");
        assertThat(tennis(2, 4)).isEqualTo("B Win");
        assertThat(tennis(3, 5)).isEqualTo("B Win");
        assertThat(tennis(5, 3)).isEqualTo("A Win");
        assertThat(tennis(4, 6)).isEqualTo("B Win");
        assertThat(tennis(7, 5)).isEqualTo("A Win");
    }

    private String tennis(final int score1, final int score2) {
        if (4 <= score1 && score1 == score2 + 2) return "A Win";
        if (4 <= score2 && score2 == score1 + 2) return "B Win";
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
