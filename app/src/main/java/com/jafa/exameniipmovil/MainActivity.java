package com.jafa.exameniipmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText edNomApe, edCiudad, edFecha;
    RadioButton rbMujer, rbHombre;
    Button btAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNomApe = findViewById(R.id.txtNombres);
        edCiudad = findViewById(R.id.txtCiudad);
        edFecha = findViewById(R.id.dateFechaNac);
        rbHombre = findViewById(R.id.rbtnHombre);
        rbMujer = findViewById(R.id.rbtnMujer);
        btAceptar = findViewById(R.id.btnAceptar);
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nomapre = edNomApe.getText().toString();
                String ciudad = edCiudad.getText().toString();
                String fecha = edFecha.getText().toString();
                String genero = "";
                if(rbHombre.isSelected()){
                    genero = rbHombre.getText().toString();
                }else if(rbMujer.isSelected()){
                    genero = rbHombre.getText().toString();
                }

                Bundle parametrosEnvio=new Bundle();
                parametrosEnvio.putString("NombreApellido",nomapre);
                parametrosEnvio.putString("Ciudad",ciudad);
                parametrosEnvio.putString("Fecha",fecha);
                parametrosEnvio.putString("Genero",genero);
                Intent intent=new Intent(MainActivity.this, FichaPersonalActivity.class);
                intent.putExtras(parametrosEnvio);
                startActivity(intent);

            }
        });

    }
}