/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex46;

import junit.framework.TestCase;

import java.io.IOException;

import static ex46.WordFrequency.wordList;

public class WordFrequencyTest extends TestCase {

    public void testIncrementFreq() throws IOException {
        WordFrequency.compareWords();
        WordFrequency.sortArray();
        assertEquals(7, wordList.get(0).getWordFreq());
        assertEquals(2, wordList.get(1).getWordFreq());
        assertEquals(1, wordList.get(2).getWordFreq());
    }
}