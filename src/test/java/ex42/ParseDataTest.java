/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex42;

import org.junit.Assert;
import org.junit.Test;


import static ex42.ParseData.dataList;

public class ParseDataTest {

    //Tests to see if data is printed out correctly, including with formatting.

    @Test
    public void testPrintList() throws Exception {

        ParseData.getData();
        System.out.printf("%-9s %-9s %.2f\n", dataList.get(0).getFirstName(), dataList.get(0).getLastName(), dataList.get(0).getSalary());
        Assert.assertEquals("Ling      Mai       55900.00\n", String.format("%-9s %-9s %.2f\n", dataList.get(0).getFirstName(), dataList.get(0).getLastName(), dataList.get(0).getSalary()));
    }
}