package com.example.control_de_rotaciion_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgViewEng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgViewEng = findViewById(R.id.imageView);
        imgViewEng.setImageResource(R.drawable.img);
    }
}