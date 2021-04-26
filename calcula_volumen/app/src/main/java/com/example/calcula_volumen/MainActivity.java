package com.example.calcula_volumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView txtProgress;
    EditText etxtRadio;
    SeekBar anguloBar;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        txtProgress = findViewById(R.id.txtProgress);
        etxtRadio = findViewById(R.id.etxtAng);
        anguloBar = findViewById(R.id.seekBar3);
        btnCalcular = findViewById(R.id.btnCalc);

        img.setImageResource(R.drawable.img);

        anguloBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                String prog = String.valueOf(progress);
                txtProgress.setText(prog);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                double angulo = Double.parseDouble(txtProgress.getText().toString());
                double radio = Double.parseDouble(etxtRadio.getText().toString());
                Log.e("VALOR DE ANGULO:::", String.valueOf(angulo));
                Log.e("VALOR DE RADIO:::", String.valueOf(radio));
                calcular(angulo,radio);


            }

        });

    }

    public void calcular(double angulo, double radio){
        double result;
        double dosTercios = .666666667;
        Log.e("VALOR DE DOSTERCIOS:::", String.valueOf(dosTercios));
        double radioCubo = Math.pow(radio, 3);
        Log.e("VALOR DE RADIOALCUBO:::", String.valueOf(radioCubo));
        double multipli1 = angulo*radioCubo;
        Log.e("VALOR DE multipli1:::", String.valueOf(multipli1));
        result = dosTercios*multipli1;
        Toast.makeText(MainActivity.this, "El volumen es :" + result,
                Toast.LENGTH_SHORT).show();
    }
}