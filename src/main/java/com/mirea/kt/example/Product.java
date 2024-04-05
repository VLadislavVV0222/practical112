package com.mirea.kt.example;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {

    private static final long serialVersionUID = -3536693998646060163L;

    private long code;
    private String name;
    private String type;
    private boolean isDiscount;
    private ArrayList<String> ingredients;
    private double price;

    public Product(long code, String name, String type, boolean isDiscount, ArrayList<String> ingredients, double price) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.isDiscount = isDiscount;
        this.ingredients = ingredients;
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}