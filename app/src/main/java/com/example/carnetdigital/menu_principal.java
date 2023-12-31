package com.example.carnetdigital;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.carnetdigital.Vista.CarnetDigital;
import com.example.carnetdigital.Vista.RegistroCarnet;


public class menu_principal extends AppCompatActivity {

    Button Btn_Horas, Btn_Registro, btn_RegistrarCarnet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Btn_Horas = findViewById(R.id.Btn_Horas);
        Btn_Registro = findViewById(R.id.Btn_Registro);
        btn_RegistrarCarnet = findViewById(R.id.btn_RegistrarCarnet);

        Btn_Horas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar la actividad de siguiente hora
                Intent intent = new Intent(menu_principal.this, Sisguiente_hora.class);
                startActivity(intent);
            }
        });

        Btn_Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar la actividad de Registro
                Intent intent = new Intent(menu_principal.this, registrado.class);
                startActivity(intent);
            }
        });

        btn_RegistrarCarnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_principal.this, RegistroCarnet.class);
                startActivity(intent);
            }
        });


    }
    public void Carnet(View view){
        Intent carnet = new Intent(menu_principal.this, CarnetDigital.class);
        startActivity(carnet);
    }
}

