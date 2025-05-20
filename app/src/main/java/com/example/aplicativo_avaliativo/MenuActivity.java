package com.example.aplicativo_avaliativo;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        findViewById(R.id.btngeradorvalores).setOnClickListener(v -> startActivity(new Intent(this, GeradorActivity.class)));
        findViewById(R.id.btninversortexto).setOnClickListener(v -> startActivity(new Intent(this, InversorInputActivity.class)));
        findViewById(R.id.btnregistroeventos).setOnClickListener(v -> startActivity(new Intent(this, RegistroEventoActivity.class)));
    }
}