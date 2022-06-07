package com.example.restapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;

import com.example.restapp.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private final List<String> mensaje = Arrays.asList(
            "Hola ¿Como estas?",
            "¿Que tal tu dia?",
            "¿Tienes hambre?",
            "Es hora de dormir",
            "¿Que hora es?",
            "¿Te gusta el pan?",
            "Hoy es martes",
            "Mañana es miercoles",
            "¿Quieres jugar?",
            "Me encantan los gatos"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTextView = findViewById(R.id.mensajeText_view);
        mButton = findViewById(R.id.button_view);
        mTextView.setText(mensaje.get(1));
    }
}