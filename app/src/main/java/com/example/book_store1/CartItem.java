package com.example.book_store1;

public class CartItem {
    private String title;
    private String description;
    private double price;
    private String image; // image resource name (e.g., "guardian_of_the_sky")
    private static int quantity = 1;

    public int  getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public CartItem(String title, String description, double price, String image) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
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

    public String getImage() {
        return image;
    }
}
