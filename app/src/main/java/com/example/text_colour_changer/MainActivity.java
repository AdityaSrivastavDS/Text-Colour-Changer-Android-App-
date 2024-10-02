package com.example.text_colour_changer;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvText;
    Button btnChangeColor;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the TextView, Button, and Random
        tvText = findViewById(R.id.tv_text);
        btnChangeColor = findViewById(R.id.btn_change_color);
        random = new Random();

        // Set the button click listener
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Generate random color and apply to the TextView
                int color = generateRandomColor();
                tvText.setTextColor(color);
            }
        });
    }

    // Function to generate a random color
    private int generateRandomColor() {
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}
