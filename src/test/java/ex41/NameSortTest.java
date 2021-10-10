/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex41;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

import static ex41.NameSort.namesList;

public class NameSortTest extends TestCase {

    public void testArraySort(){

        String[] actualNames = { "Johnson, Jim","Jones, Aaron","Jones, Chris", "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina"};
        ArrayList<String> actualNamesList = new ArrayList<>(Arrays.asList(actualNames));

        NameSort.getNames();
        NameSort.sortNames();
        assertEquals(actualNamesList, namesList); //Tests to see if names were sorted correctly in the array

    }

}