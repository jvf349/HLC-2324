package com.example.pruebapresencial2trimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button boton;

    final int min = 20;
    final int max = 80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.numero);
        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generadorNumero();
            }
        });
    }

    public void generadorNumero() {

        int random = new Random().nextInt(max - min);
        try {
            Thread.sleep(5000);//5 segundos
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        textView.setText(Integer.toString(random));
    }
}