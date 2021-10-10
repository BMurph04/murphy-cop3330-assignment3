/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex44;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class ProductList {
    @SerializedName("products")
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        return productList;
    }
    public void setProductList(ArrayList<Product> products) {
        this.productList = products;
    }

}
