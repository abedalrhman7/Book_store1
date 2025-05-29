package com.example.book_store1;

public class CartItem {
    private String title;
    private String description;
    private double price;

    public CartItem(String title, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
