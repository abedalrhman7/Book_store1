package com.example.book_store1;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CartManager  {

    // Singleton instance
    private static CartManager instance;

    // List to hold cart items
    private final List<CartItem> cartItems;

    // Private constructor for Singleton
    private CartManager() {
        cartItems = new ArrayList<>();
    }

    // Public method to access the singleton instance
    public static synchronized CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    // Add a new item to the cart
    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    // Retrieve all items in the cart
    public List<CartItem> getCartItems() {
        return new ArrayList<>(cartItems); // Return a copy to avoid direct modification
    }

    // Clear the cart
    public void clearCart() {
        //cartItems.clear();
    }

    public void removeItem(CartItem item) {
        cartItems.remove(item);
    }
}
