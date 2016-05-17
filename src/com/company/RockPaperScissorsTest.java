package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by csabau on 5/17/2016.
 */
public class RockPaperScissorsTest {
    @Test
    public void testPlayer1Wins() {
        System.out.println("Tests Player 1 won!");
        assertEquals("Player 1 won!", RockPaperScissors.letsPlayRockPaperScissors("rock", "scissors"));
        assertEquals("Player 1 won!", RockPaperScissors.letsPlayRockPaperScissors("scissors", "paper"));
        assertEquals("Player 1 won!", RockPaperScissors.letsPlayRockPaperScissors("paper", "rock"));
    }
    @Test
    public void testPlayer2Wins() {
        System.out.println("Tests Player 2 won!");
        assertEquals("Player 2 won!", RockPaperScissors.letsPlayRockPaperScissors("scissors", "rock"));
        assertEquals("Player 2 won!", RockPaperScissors.letsPlayRockPaperScissors("paper", "scissors"));
        assertEquals("Player 2 won!", RockPaperScissors.letsPlayRockPaperScissors("rock", "paper"));
    }
    @Test
    public void testItsADraw() {
        System.out.println("Tests Draw!");
        assertEquals("Draw!", RockPaperScissors.letsPlayRockPaperScissors("scissors", "scissors"));
        assertEquals("Draw!", RockPaperScissors.letsPlayRockPaperScissors("paper", "paper"));
        assertEquals("Draw!", RockPaperScissors.letsPlayRockPaperScissors("rock", "rock"));
    }
}
