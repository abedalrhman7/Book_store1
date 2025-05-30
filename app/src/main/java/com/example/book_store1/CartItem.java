package com.example.book_store1;

public class CartItem {

    private final String title;
    private final String description;
    private final double price;
    private final String image; // image resource name (e.g., "guardian_of_the_sky")
    private int quantity;  // **not static anymore**

    public CartItem(String title, String description, double price, String image) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
        this.quantity = 1;  // default quantity for each item
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 1) {
            quantity = 1; // Prevent quantity less than 1
        }
        this.quantity = quantity;
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
