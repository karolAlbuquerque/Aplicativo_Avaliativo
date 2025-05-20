package com.example.aplicativo_avaliativo;


import android.os.Bundle;
import android.widget.*;
        import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RegistroEventoActivity extends AppCompatActivity {
    EditText edtEvento;
    DatePicker datePicker;
    ListView listView;
    ArrayList<String> eventos = new ArrayList<>();
    int contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        edtEvento = findViewById(R.id.edtEvento);
        datePicker = findViewById(R.id.datePicker);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, eventos);
        listView.setAdapter(adapter);

        Button btnAdicionar = findViewById(R.id.btnAdicionar);
        btnAdicionar.setOnClickListener(v -> {
            String evento = edtEvento.getText().toString();
            int dia = datePicker.getDayOfMonth();
            int mes = datePicker.getMonth() + 1;
            int ano = datePicker.getYear();
            String data = String.format("%02d/%02d/%04d", dia, mes, ano);
            eventos.add(contador++ + " | " + data + " | " + evento);
            adapter.notifyDataSetChanged();
        });
    }
}