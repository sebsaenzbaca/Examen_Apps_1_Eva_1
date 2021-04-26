package com.example.acredita_no_acredita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 ImageView img1;
 ImageView img2;
 ImageView img3;
 SeekBar acrBar;
 SeekBar calBar;
 TextView txtResult;
 TextView txtAcr;
 TextView txtCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        acrBar = findViewById(R.id.seekBarAcreditar);
        acrBar.setMax(100);
        calBar = findViewById(R.id.seekBarCalificacion);
        calBar.setMax(100);
        txtResult = findViewById(R.id.textView5);
        txtAcr= findViewById(R.id.puntosAcre);
        txtCal= findViewById(R.id.puntosCal);

        img1.setImageResource(R.drawable.tecii);
        img2.setImageResource(R.drawable.perfil);
        img3.setImageResource(R.drawable.tecnm);


        acrBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                String prog = String.valueOf(progress);
                txtAcr.setText(prog);
                verificar(progress, Integer.parseInt(txtCal.getText().toString()));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });
        calBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                String prog = String.valueOf(progress);
                txtCal.setText(prog);
                verificar(Integer.parseInt(txtAcr.getText().toString()), progress);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void verificar(int progressAcred, int progressCalf){
        if(progressAcred > progressCalf){
            txtResult.setText("Reprobado");
        }else{
            txtResult.setText("Aprobado");
        }
    }

}