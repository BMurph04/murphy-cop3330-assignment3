/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex46;

public class WordInfo implements Comparable<WordInfo> {

    //Contains information about the word and the frequency of the word
    private String word;
    private int wordFreq;

    public WordInfo(String word) {
        this.word = word;
        wordFreq = 1;
    }

    public String getWord() {
        return word;
    }

    public int getWordFreq() {
        return wordFreq;
    }

    public void setWordFreq(int wordFreq) {
        this.wordFreq = wordFreq;
    }

    //Contains comparable that will compare the frequencies of each word
    @Override
    public int compareTo(WordInfo compareWord) {
        int compareFreq = compareWord.getWordFreq();
        return compareFreq - this.wordFreq;
    }

    //Prints word info as a string
    @Override
    public String toString() {
        StringBuilder stars = new StringBuilder();
        for(int i=0; i<wordFreq; i++){
            stars.append("*");
        }
        return String.format("%-9s: %s", word, stars);
    }


}