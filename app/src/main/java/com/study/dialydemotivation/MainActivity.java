package com.study.dialydemotivation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newPhrase(View view){
        String[] phrases = {"Seja feliz. A base de remédios.",
                "Plágio economiza tempo!",
                "Aquela festa parece legal... Ninguém te convidou.",
                "Uma mulher te cantou...era um travesti.",
                "Faça um elogio. Não receba outro em troca.",
                "Finalmente ela olhou pra você. E te achou feio."
        };

        int num = new Random().nextInt(phrases.length);
        TextView text = findViewById(R.id.text_result);
        text.setText(phrases[num]);
    }
}
