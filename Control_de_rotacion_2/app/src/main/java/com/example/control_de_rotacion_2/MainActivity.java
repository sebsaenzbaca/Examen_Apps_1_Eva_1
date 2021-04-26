package com.example.control_de_rotacion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgViewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgViewText = findViewById(R.id.imageView2);
        imgViewText.setImageResource(R.drawable.img);
    }
}