package com.example.uts;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        // Mendapatkan data yang diteruskan dari MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String itemName = extras.getString("itemName");
            String itemDetails = extras.getString("itemDetails");
            int itemImageResource = extras.getInt("itemImage");

            // Menampilkan data pada layout DetailActivity
            TextView textViewName = findViewById(R.id.textViewName);
            TextView textViewDetails = findViewById(R.id.textViewDetails);
            ImageView imageViewItem = findViewById(R.id.imageViewItem);

            textViewName.setText(itemName);
            textViewDetails.setText(itemDetails);
            imageViewItem.setImageResource(itemImageResource);
        }
    }
}
