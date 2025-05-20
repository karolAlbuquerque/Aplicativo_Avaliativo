package com.example.aplicativo_avaliativo;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class GeradorActivity extends AppCompatActivity {
    EditText edtMin, edtMax;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        edtMin = findViewById(R.id.edtMin);
        edtMax = findViewById(R.id.edtMax);
        txtResultado = findViewById(R.id.txtResultado);

        Button btnGerar = findViewById(R.id.btnGerar);
        btnGerar.setOnClickListener(v -> {
            int min = Integer.parseInt(edtMin.getText().toString());
            int max = Integer.parseInt(edtMax.getText().toString());
            int valor = new Random().nextInt(max - min + 1) + min;
            txtResultado.setText("Número gerado: " + valor);
        });
    }
}