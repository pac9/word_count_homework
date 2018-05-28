package com.example.pauline.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {


    EditText questionEditText;
    TextView responseText;
    Button pressButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        questionEditText = findViewById(R.id.ask_for_sentence);
        responseText = findViewById(R.id.response_view);
        pressButton = findViewById(R.id.press_button);

    }


    public void onSubmitResponse(View button) {

        String words = questionEditText.getText().toString();

        WordCounter wordCounter = new WordCounter();

        int answer = wordCounter.splitInputIntoSeparateWords(words);

        responseText.setText("There are " + Integer.toString(answer) + " words in that sentence.");

    }
}
