package com.example.androidjoker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {

    public final static String JOKE_INTENT = "newJoke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        String joke = getIntent().getStringExtra(JOKE_INTENT);
        TextView jokeTV = (TextView)findViewById(R.id.joke_tv);
        jokeTV.setText(joke);

    }
}
