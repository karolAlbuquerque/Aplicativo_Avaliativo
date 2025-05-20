package com.example.aplicativo_avaliativo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class InversorInputActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        EditText edtTexto = findViewById(R.id.edtTexto);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(v -> {
            String texto = edtTexto.getText().toString();
            Intent intent = new Intent(this, InversorResultadoActivity.class);
            intent.putExtra("texto", texto);
            startActivity(intent);
        });
    }
}