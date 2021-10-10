/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex45;

import junit.framework.TestCase;

public class WordFinderTest extends TestCase {

    public void testWriteString() {

        String initialMsg = WordFinder.readString();
        String finalMsg = WordFinder.replaceString(initialMsg);
        assertEquals("One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".\n", finalMsg);
    }
}