package com.desafiolatam.casadagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.desafiolatam.casadagger.model.Casa;
import com.desafiolatam.casadagger.model.Habitaciones;
import com.desafiolatam.casadagger.model.Puertas;
import com.desafiolatam.casadagger.model.Ventanas;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    private Casa casa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IAppComponent component = DaggerIAppComponent.create();
        casa = component.getCasa();
        casa.construir();
        }
    }


