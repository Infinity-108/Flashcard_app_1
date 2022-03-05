package com.example.flashcard_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView question = findViewById(R.id.question_textview);
        TextView answer1 = findViewById(R.id.answer1_textview);
        TextView answer2 = findViewById(R.id.answer2_textview);
        TextView answer3 = findViewById(R.id.answer3_textview);
        ImageView open_icon = findViewById(R.id.open_eye);
        ImageView closed_icon = findViewById(R.id.closed_eye);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer2.setBackgroundColor(getResources().getColor(R.color.red));
                answer1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer3.setBackgroundColor(getResources().getColor(R.color.red));
                answer1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        closed_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closed_icon.setVisibility(View.INVISIBLE);
                open_icon.setVisibility(View.VISIBLE);
                answer1.setVisibility(View.INVISIBLE);
                answer2.setVisibility(View.INVISIBLE);
                answer3.setVisibility(View.INVISIBLE);
            }
        });

        open_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_icon.setVisibility(View.INVISIBLE);
                closed_icon.setVisibility(View.VISIBLE);
                answer1.setVisibility(View.VISIBLE);
                answer2.setVisibility(View.VISIBLE);
                answer3.setVisibility(View.VISIBLE);
            }
        });

    }
}