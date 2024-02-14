package com.jafa.exameniipmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FichaPersonalActivity extends AppCompatActivity {
    TextView edNom, edCiu, edGen, edFe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_personal);

        edNom = findViewById(R.id.lblnuevoNom);
        edCiu = findViewById(R.id.lblnuevoCiudad);
        edFe = findViewById(R.id.lblnuevoFecha);
        edGen = findViewById(R.id.lblnuevoGenero);

        Bundle parametros = this.getIntent().getExtras();
        if (parametros != null) {
            String nombreape = parametros.getString("NombreApellido");
            String ciudad = parametros.getString("Ciudad");
            String fecha = parametros.getString("Fecha");
            String genero = parametros.getString("Genero");

            edNom.setText(nombreape);
            edCiu.setText(ciudad);
            edNom.setText(fecha);
            edNom.setText(genero);

        }
    }
}