package com.makosavage;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = false;
	    int score = 10000;
	    int levelComplited = 8;
	    int bonus = 200;

//	  	calculateScore(gameOver, score, levelComplited, bonus);

		displayHighScorePosition("Mako", 1500);
		displayHighScorePosition("Paweł", 900);
		displayHighScorePosition("Adam", 400);
		displayHighScorePosition("Damian", 800);

    }

    public static int calculateScore(boolean gameOver, int score, int levelComplited, int bonus){
		if (gameOver == true){
			int finalScore = score + (levelComplited*bonus);
			finalScore += 2000;
			System.out.println("Your final score: " + finalScore);
			return finalScore;
		} else {
			int finalScore = -1;
			return finalScore;
		}
	}

	public static void displayHighScorePosition(String playersName, int score){
    	int playersPlace = playersPlace(score);
		System.out.println("Player Name: " + playersName + " Place: " + playersPlace);
	}

	public static int playersPlace(int score){
    	if (score >1000){
    		return 1;
		}
		else if ((score>500) && (score<1000)){
			return 2;
		}
		else if ((score>100) && (score<500)){
			return 3;
		}else {
			return 4;
		}
	}
}
