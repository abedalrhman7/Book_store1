package com.example.book_store1;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class CartActivity extends AppCompatActivity {

    private LinearLayout cartItemsContainer;
    private TextView totalPriceView;
    private List<CartItem> cartList;
    private double totalPrice = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // Initialize views
        cartItemsContainer = findViewById(R.id.cart_items_container);
        totalPriceView = findViewById(R.id.total_price);

        // Get cart items
        cartList = CartManager.getInstance().getCartItems();

        if (cartList == null || cartList.isEmpty()) {
            Toast.makeText(this, "Cart is empty", Toast.LENGTH_SHORT).show();
            totalPriceView.setText("Total: 0 JD");
            return;
        }

        // Add each item to the view and calculate total
        for (CartItem item : cartList) {
            addCartItemView(item);
            totalPrice += item.getPrice();
        }

        totalPriceView.setText("Total: " + totalPrice + " JD");
    }

    private void addCartItemView(CartItem item) {
        TextView itemView = new TextView(this);
        itemView.setTextSize(16);
        itemView.setPadding(8, 8, 8, 8);
        itemView.setText(item.getTitle() + " - " + item.getPrice() + " JD");
        cartItemsContainer.addView(itemView);
    }
}
