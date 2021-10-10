/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex44;

import junit.framework.TestCase;

public class ProductSearchTest extends TestCase {

    public void testPrintResult() {

        Product testProduct = new Product();
        testProduct.setName("Thing");
        testProduct.setPrice(15.00);
        testProduct.setQuantity(5);

        ProductSearch.printResult(testProduct);
        assertEquals("Name: Thing\nResult: "+15.00+"\nQuantity: "+5, "Name: "+testProduct.getName()+"\nResult: "+testProduct.getPrice()+"\nQuantity: "+testProduct.getQuantity());

    }
}