package com.company;

public class RockPaperScissors {

    public static void main(String[] args) {
	// write your code here
    }

    public static String letsPlayRockPaperScissors(String p1, String p2) {
        if(p1 == p2)
            return "Draw!";

        if(p1.equals("rock") && p2.equals("scissors") ||
                p1.equals("paper") && p2.equals("rock") ||
                p1.equals("scissors") && p2.equals("paper"))
            return "Player 1 won!";
        else
            return "Player 2 won!";

    }
}
