package com.example.book_store1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        LinearLayout itemLayout = new LinearLayout(this);
        itemLayout.setOrientation(LinearLayout.HORIZONTAL);
        itemLayout.setPadding(8, 8, 8, 8);
        itemLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        itemLayout.setWeightSum(1f);

        // Image
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(150, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(0, 0, 16, 0);

        int imageResId = getResources().getIdentifier(item.getImage(), "drawable", getPackageName());
        imageView.setImageResource(imageResId != 0 ? imageResId : R.drawable.be_happy);

        // Text layout
        LinearLayout textLayout = new LinearLayout(this);
        textLayout.setOrientation(LinearLayout.VERTICAL);
        textLayout.setLayoutParams(new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        TextView titleView = new TextView(this);
        titleView.setText(item.getTitle());
        titleView.setTextSize(16f);

        TextView priceView = new TextView(this);
        priceView.setText(item.getPrice() + " JD");
        priceView.setTextSize(14f);

        // Quantity display
        TextView quantityView = new TextView(this);
        quantityView.setText("1"); // Initial quantity
        quantityView.setTextSize(14f);
        quantityView.setPadding(8, 0, 8, 0);

        // Buttons layout
        LinearLayout buttonLayout = new LinearLayout(this);
        buttonLayout.setOrientation(LinearLayout.HORIZONTAL);
        buttonLayout.setPadding(0, 8, 0, 0);

        Button plusButton = new Button(this);
        plusButton.setText("+");

        Button minusButton = new Button(this);
        minusButton.setText("-");

        Button deleteButton = new Button(this);
        deleteButton.setText("Delete");

        // Logic for buttons
        final int[] quantity = {1};
        plusButton.setOnClickListener(v -> {
            quantity[0]++;
            item.setQuantity(quantity[0]);
            quantityView.setText(String.valueOf(quantity[0]));
            updateTotalPrice();
        });
        if (cartList == null || cartList.isEmpty()) {
            Toast.makeText(this, "Cart is empty", Toast.LENGTH_SHORT).show();
            totalPriceView.setText("Total: 0 JD");
            return;
        }


        minusButton.setOnClickListener(v -> {
            if (quantity[0] > 1) {
                quantity[0]--;
                quantityView.setText(String.valueOf(quantity[0]));
                updateTotalPrice();
            }
        });

        deleteButton.setOnClickListener(v -> {
            cartItemsContainer.removeView(itemLayout);
            CartManager.getInstance().removeItem(item);
            updateTotalPrice();
        });

        buttonLayout.addView(minusButton);
        buttonLayout.addView(quantityView);
        buttonLayout.addView(plusButton);
        buttonLayout.addView(deleteButton);

        textLayout.addView(titleView);
        textLayout.addView(priceView);
        textLayout.addView(buttonLayout);

        itemLayout.addView(imageView);
        itemLayout.addView(textLayout);

        cartItemsContainer.addView(itemLayout);
    }

    private void updateTotalPrice() {
        double newTotal = 0.0;

        for (int i = 0; i < cartItemsContainer.getChildCount(); i++) {
            LinearLayout itemLayout = (LinearLayout) cartItemsContainer.getChildAt(i);
            LinearLayout textLayout = (LinearLayout) itemLayout.getChildAt(1);
            LinearLayout buttonLayout = (LinearLayout) textLayout.getChildAt(2);
            TextView quantityView = (TextView) buttonLayout.getChildAt(1);
            TextView priceView = (TextView) textLayout.getChildAt(1);

            int quantity = Integer.parseInt(quantityView.getText().toString());
            double price = Double.parseDouble(priceView.getText().toString().replace(" JD", "").trim());

            newTotal += price * quantity;


        }

        totalPriceView.setText("Total: " + newTotal + " JD");
    }



}
