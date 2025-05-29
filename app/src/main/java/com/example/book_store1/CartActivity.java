package com.example.book_store1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
        // Create horizontal LinearLayout
        LinearLayout itemLayout = new LinearLayout(this);
        itemLayout.setOrientation(LinearLayout.HORIZONTAL);
        itemLayout.setPadding(8, 8, 8, 8);
        itemLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        // Create and add ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(150, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(0, 0, 16, 0);

        int imageResId = getResources().getIdentifier(item.getImage(), "drawable", getPackageName());
        if (imageResId != 0) {
            imageView.setImageResource(imageResId);
        } else {
            imageView.setImageResource(R.drawable.be_happy); // Optional fallback
        }

        // Create vertical layout for title + price
        LinearLayout textLayout = new LinearLayout(this);
        textLayout.setOrientation(LinearLayout.VERTICAL);
        textLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        TextView titleView = new TextView(this);
        titleView.setText(item.getTitle());
        titleView.setTextSize(16f);
        titleView.setTextColor(getColor(android.R.color.black));

        TextView priceView = new TextView(this);
        priceView.setText(item.getPrice() + " JD");
        priceView.setTextSize(14f);
        priceView.setTextColor(getColor(android.R.color.darker_gray));

        textLayout.addView(titleView);
        textLayout.addView(priceView);

        itemLayout.addView(imageView);
        itemLayout.addView(textLayout);

        cartItemsContainer.addView(itemLayout);
    }


}
