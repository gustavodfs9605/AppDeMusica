package com.example.tienda_de_musica;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventoClick();
    }

    public void eventoClick() {
        Button botonCargar = (Button) findViewById(R.id.botonCargarArtista);
        botonCargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.texto);
                tv.setText("Holaa");
            }
        });

    }
}