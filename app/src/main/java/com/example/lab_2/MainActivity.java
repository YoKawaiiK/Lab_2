package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView id_phrase; // Поле для значения процента

    // Создание объекта класса Phraser
    private Phraser phraser = new Phraser();

    // Создание преставления
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_phrase = findViewById(R.id.id_phrase);

        String text_phrase = phraser.PhraserGen();

        id_phrase.setText(text_phrase);
    }
}