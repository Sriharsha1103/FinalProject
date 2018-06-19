package com.example.jokeactivitylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayActivity extends AppCompatActivity {
    TextView display_joke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        display_joke = findViewById(R.id.id_display_joke);
        Bundle bundle = getIntent().getExtras();
        display_joke.setText(bundle.getString("joke"));

    }
}
