package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Создание объекта класса Phraser
    private Phraser phraser = new Phraser();

    // Создание преставления
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем элементы
        TextView id_phrase = (TextView) findViewById(R.id.id_phrase); // Поле
        Button id_genButton = (Button) findViewById(R.id.id_genButton);


        // Установить начальную фразу
        id_phrase.setText(phraser.PhraserGen());

        id_genButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                String text_phrase = phraser.PhraserGen();

                id_phrase.setText(text_phrase);
            }
        });
    }


}