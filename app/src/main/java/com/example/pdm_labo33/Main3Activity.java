package com.example.pdm_labo33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mtext = findViewById(R.id.tv_shared_text);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            mtext.setText(mIntent.getStringExtra(mIntent.EXTRA_TEXT));
        }
    }

}
