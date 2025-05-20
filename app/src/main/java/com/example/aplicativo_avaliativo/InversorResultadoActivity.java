package com.example.aplicativo_avaliativo;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class InversorResultadoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        String texto = getIntent().getStringExtra("texto");
        String invertido = new StringBuilder(texto).reverse().toString();
        TextView txtInvertido = findViewById(R.id.txtInvertido);
        txtInvertido.setText(invertido);
    }
}