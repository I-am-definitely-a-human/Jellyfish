package model;

import java.util.Random;

/**
 * @author Allen Tong - awtong
 * CIS175 - Spring 2023
 * Feb 6, 2023
 */

public class WordScrambler {
	
	private final String[] words = new String[] {
			"JAVA",
			"MAVEN",
			"SERVLET",
			"PIZZA",
			"PERSISTENCE",
			"BURGER",
			"JELLYFISH",
			"GARDEN",
			"SPACE",
			"GALAXY",
			"CLOUD",
			"TREE",
			"STAR",
			"ECLIPSE"
	};
	
	private String word;
	private String scrambledWord;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getScrambledWord() {
		return scrambledWord;
	}
	public void setScrambledWord(String scrambledWord) {
		this.scrambledWord = scrambledWord;
	}
	
	public void scrambleWord(String word) {
		Random rand = new Random();
		
		String finalWord = "";
		
		for (char c : word.toCharArray()) {
			if (rand.nextInt(2) == 1) {
				finalWord = c + finalWord;
			} else {
				finalWord = finalWord + c;
			}
		}
		
		this.scrambledWord = finalWord.toUpperCase();
		
	}
	
	/**
	 * Gets a random word from word list
	 * @return - the random word
	 */
	public String getRandomWordFromWordList() {
		return words[(new Random()).nextInt(words.length)];
	}
	
	
	/**
	 * Constructor
	 */
	public WordScrambler() {
		this.word = getRandomWordFromWordList().toUpperCase();
		scrambleWord(this.word);
	}
	
}
